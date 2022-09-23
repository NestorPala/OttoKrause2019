package z02;

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
				System.out.println("Ejercicio 2");
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
		ClientHandler cliente = new ClientHandler(socket);
		cliente.handle();
	}
}


class ClientHandler extends Thread {
	
	private Socket socket;
	
	public ClientHandler (Socket socket) {
		this.socket = socket;
	}
	
	public void handle () {
		this.start();
	}
	
	public void run () {
		try {
			System.out.println("Conectado a " + this.socket.toString());
			Scanner input = new Scanner(this.socket.getInputStream());
			PrintWriter output = new PrintWriter(this.socket.getOutputStream());
			
			String clientMessage;
			
			while (input.hasNextLine()) {
				clientMessage = input.nextLine();
				System.out.println();
				System.out.println(clientMessage);
				output.println(clientMessage);
				output.flush();
			}
		}
		catch (Exception e) {		
		}
	}
}