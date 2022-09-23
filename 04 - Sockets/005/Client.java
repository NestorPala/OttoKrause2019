/*
 * Ejercicio 5
Escribir un programa que implemente un servidor que devuelva cada línea de texto que le envíe un
cliente de manera invertida.
 */

package z05;

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
		
		System.out.println("Ejercicio 5");
		echo();
	}
	
	
	private static void echo() {
		Scanner a = new Scanner(System.in);
		String message;
		String answer;
		
		while (true) {
			message = a.nextLine();
			output.println(message);
			output.flush();
			
			answer = input.nextLine();
			System.out.println(answer);
		}
	}
}

