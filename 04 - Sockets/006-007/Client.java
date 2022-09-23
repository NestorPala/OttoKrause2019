/*
 * Ejercicio 6
Escribir un programa que implemente un servidor que le permita a los clientes enviar una operaci�n
aritm�tica (+, -, *, /, %) y los operandos, y que responda con el resultado de la operaci�n. El servidor
deber� permitir realizar varias operaciones hasta que el cliente env�e como operaci�n la palabra END. El
servidor deber� poder atender a m�ltiples clientes de manera simult�nea.
 */

package z06;

import java.io.*;
import java.net.*;
import java.util.NoSuchElementException;
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
		
		System.out.println("Ejercicio 6");
		echo();
	}
	
	
	private static void echo () throws IOException {
		Scanner a = new Scanner(System.in);
		String message;
		String answer;
		int aux = 0;
		
		while ((message = a.nextLine()) != null) {
			output.println(message);
			output.flush();
			answer = input.nextLine();
			System.out.println(answer);
		}
		
	    socket.close();
	    output.close();
	    input.close();
	    System.exit(0);
	}
}