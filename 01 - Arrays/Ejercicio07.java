/*Crear un arreglo de enteros de N elementos. Generar e imprimir por pantalla un arreglo 
 * que contenga los elementos del primer arreglo en orden inverso. */

public class Ejercicio07 {
	public static int[] InvertirArreglo (int[] a) {
		
		int[] total = new int[a.length];
		int i;
		
		for (i=0; i<a.length; i++) {
			total[i] = a[(a.length-1) - i];
		}
			
		return total;
	}
	
	public static void main (String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, inv = new int[array.length];
		
		inv = InvertirArreglo(array);
		
		for (int j=0; j<array.length; j++) System.out.println(inv[j]);
	}
}