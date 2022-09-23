package z08;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	
	static ServerSocket serverSocket;
	static Socket socket;
	static Scanner input;
	static PrintWriter output;
	static int port;
	
	
	public static void main (String[] args) throws Exception {
		
		//puerto = (int)(Math.random() * 64511 + 1023);
		port = 12345;
		
		try {
			serverSocket = new ServerSocket(port);
			
			while (true) {
				System.out.println("Ejercicio 8");
				System.out.println("Esperando conexiones en el puerto " + port);
				socket = serverSocket.accept();
				System.out.println("Conectado a " + socket.toString());
				input = new Scanner(socket.getInputStream());
				output= new PrintWriter(socket.getOutputStream());
				
				echo();
			}
		}
		catch (Exception e){
		}
	}
	
	
	private static void echo () {
		String clientMessage, answer;
		
		while (input.hasNextLine()) {
			clientMessage = input.nextLine();
			System.out.println(clientMessage); //verif.
			
			answer = sortAscMessage(clientMessage);
			
			System.out.println(answer);
			
			output.println(answer);
			output.flush();
		}
	}
	
	private static String sortAscMessage (String message) {
		String result = "";
		String[] numbers = new String[message.length() / 2];
		double[] numbers2 = new double[numbers.length];
		int a = 0;
		
		for (char ch: message.toCharArray()) {
			if (ch != ' ') {
				numbers[a] += ch;
			}
			else {
				a++;
			}
		}
		
		
		for (int i=0; i<numbers.length; i++) {
			numbers2[i] = Double.parseDouble(numbers[i]);
		}
		
		
		double aux = 0;
		
		for (int i=1; i<numbers2.length; i++)
		{
			for (int j=0; j<(numbers2.length-1); j++)
			{
				if (numbers2[i] > numbers2[j])
				{
					aux = numbers2[i];
					numbers2[i] = numbers2[j];
					numbers2[j] = aux;
				}
			}
		}
		
		
		for (int i=0; i<numbers2.length; i++) {
			result += String.valueOf(numbers2[i]) + " - ";
		}
		
		
		return result;
	}
}