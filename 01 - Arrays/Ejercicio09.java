/*Crear dos arreglos de enteros de N elementos. Calcular e imprimir por pantalla el 
 * resultado del producto escalar de los arreglos. El producto escalar de dos arreglos 
 * se define como la sumatoria del producto de los elementos que se encuentran en la 
 * misma posición en cada uno de los arreglos.*/

public class Ejercicio09 {
	public static double Escalar (double[] a, double[] b, int size) {
		
		double esctotal = 0;
		
		for (int i=0; i<size; i++) {
			esctotal += a[i] * b[i];
		}
		
		return esctotal;
	}
	
	public static void main (String[] args) {
		int tam = 5;
		double[] a1 = {1, 2, 3, 4, 5}, a2 = {3.5, 2.5, 4.5, 6, 8};
		double prodescalar = 0;
		
		prodescalar = Escalar(a1, a2, tam);
		
		System.out.println(prodescalar);
	}
}