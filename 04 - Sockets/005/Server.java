/*
 * Ejercicio 5
Escribir un programa que implemente un servidor que devuelva cada línea de texto que le envíe un
cliente de manera invertida.
 */

package z05;

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
				System.out.println("Ejercicio 5");
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
			
			answer = reverseMessage(clientMessage);
			
			output.println(answer);
			output.flush();
		}
	}
	
	private static String reverseMessage (String message) {
		String result = "";
		
		for (int i = message.length()-1; i>=0; i--){
            result += message.charAt(i);
        }
		
		return result;
	}
}

