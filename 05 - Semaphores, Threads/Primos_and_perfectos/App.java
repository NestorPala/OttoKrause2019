/*
 * escribir un programa que le pida al usuario ingresar N numeros enteros y que, 
 * utilizando 2 threads, en uno calcule que numeros son primos y cuales no, y en 
 * el otro cuales numeros son perfectos y cuales no. imprima el resultado por pantalla.
 */


public class App {
	public static void main (String[] args) throws Exception {
		
		int[] array1 = {1,2,3,4,5,6,7,28,29,30,496,512,1024,8887};
		
		
		ThreadPrimos a = new ThreadPrimos(array1);
		ThreadPerfectos b = new ThreadPerfectos(array1);
		
		a.start();
		b.start();
		
		a.join();
		b.join();
	}
}
