package z06;

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
				System.out.println("Ejercicio 6");
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
			
			String clientMessage="", answer="";
			
			while (input.hasNextLine()) {
				clientMessage = input.nextLine();
				System.out.println(clientMessage);
				
				answer = doOperation(clientMessage);
				
				if(answer==null) {
					socket.close();
				}
				
				output.println(answer);
				output.flush();
			}
		}
		catch (Exception e) {		
		}
	}
	
	private static String doOperation (String message) {
		
		double num1;
		String operator = "";
		double num2;
		double total = 0;
		
		String[] parts = new String[2];
		String result = "";
	
		if(message.contains("END")) {
			parts[0] = null;
			parts[0] = null;
		}
		
		if (message.contains("+")) {
			parts = message.split("\\+");
			operator = "+";
		}
	
		
		if (message.contains("-")) {
			parts = message.split("-");
			operator = "-";
		}
		
		if (message.contains("*")) {
			parts = message.split("\\*");
			operator = "*";
		}
		
		if (message.contains("/")) {
			parts = message.split("/");
			operator = "/";
		}
		
		if (message.contains("%")) {
			parts = message.split("%");
			operator = "%";
		}
		
		
		num1 = Double.parseDouble(parts[0]);
		num2 = Double.parseDouble(parts[1]);
		
		
		switch (operator) {
			case "+":
				total = num1 + num2;
				break;
			
			case "-":
				total = num1 - num2;
				break;
			
			case "*":
				total = num1 * num2;
				break;
			
			case "/":
				total = num1 / num2;
				break;
				
			case "%":
				total = num1 % num2;
				break;
				
			default:
				result = "Operacion no permitida";
		}
		
		result = String.valueOf(total);
		return result;
	}
}