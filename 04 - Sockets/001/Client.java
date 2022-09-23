/*
 * Ejercicio 1
	Escribir un programa que implemente un servidor de echo que atienda a un único usuario a la vez.
 */

package z01;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	

	static Socket socket;
	static Scanner input;
	static PrintWriter output;
	static String host = "localhost";
	static int puerto = 12345;
	
	
	public static void main (String[] args) throws Exception {
		
		try {
			socket = new Socket(host, puerto);
			input = new Scanner(socket.getInputStream());
			output = new PrintWriter(socket.getOutputStream());
		}
		catch (Exception e) {
		}

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
