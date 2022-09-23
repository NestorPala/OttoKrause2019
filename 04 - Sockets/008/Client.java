package z08;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	

	static Socket socket;
	static Scanner input;
	static PrintWriter output;
	static String host = "localhost";
	static int port = 12345;
	
	
	public static void main (String[] args) throws Exception {
		
		try {
			socket = new Socket(host, port);
			input = new Scanner(socket.getInputStream());
			output = new PrintWriter(socket.getOutputStream());
		}
		catch (Exception e) {
		}
		
		System.out.println("Ejercicio 8");
		echo();
	}
	
	
	private static void echo() {
		String message;
		String answer;
		
		while (true) {
			message = createArray(10);
			output.println(message);
			output.flush();
			
			answer = input.nextLine();
			System.out.println(answer);
		}
	}
	
	
	private static String createArray(int amount) {
		Scanner a = new Scanner(System.in);
		String result = "";
		
		for (int i=0; i<amount; i++) {
			System.out.println("Ingrese el numero " + (i+1) + "/" + amount);
			result += a.nextLine() + " ";
		}

		return result;
	}
}
