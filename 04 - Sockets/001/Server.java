/*
 * Ejercicio 1
	Escribir un programa que implemente un servidor de echo que atienda a un único usuario a la vez.
 */

package z01;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	
	static ServerSocket serverSocket;
	static Socket socket;
	static Scanner input;
	static PrintWriter output;
	static int puerto;
	
	
	public static void main (String[] args) throws Exception {
		
		//puerto = (int)(Math.random() * 64511 + 1023);
		puerto = 12345;
		
		try {
			serverSocket = new ServerSocket(puerto);
			
			while (true) {
				System.out.println("Esperando conexiones en el puerto " + puerto);
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
		String clientMessage;
		
		while (input.hasNextLine()) {
			clientMessage = input.nextLine();
			System.out.println(clientMessage);
			output.println(clientMessage);
			output.flush();
		}
	}
}
