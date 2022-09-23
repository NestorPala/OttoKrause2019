/*Crear un arreglo de enteros de N elementos. Calcular e imprimir por pantalla el 
 * resultado del producto escalar entre el arreglo y un arreglo que contenga los 
 * elementos del primer arreglo en orden inverso.*/

public class Ejercicio10 {
	public static double EscalarInverso (double[] a) {
		
		int i;
		double total = 0;
		double[] b = new double[a.length];
		
		for (i=0; i<a.length; i++) {
			b[i] = a[(a.length-1) - i];
		}
		
		for (i=0; i<a.length; i++) {
			total += a[i] * b[i];
		}
		
		return total;
	}
	
	
	public static void main (String[] args) {
		double[] array = {2, 3, 4, 5, 6};
		double esctotal = 0;
		
		esctotal = EscalarInverso(array);
		
		System.out.println(esctotal);
	}	
}

