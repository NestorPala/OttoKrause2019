/*Crear un arreglo de enteros de N elementos. Generar otro arreglo que es el resultado 
 * del producto del arreglo por el escalar 3.14. El producto de un arreglo por un escalar 
 * se define como la multiplicación de cada una de sus posiciones por el escalar. 
 * Imprimir por pantalla los elementos del arreglo resultante. */

public class Ejercicio08 {
	public static double[] Escalar3_14 (double[] a) {
		
		double[] total = new double[a.length];
		
		for (int i=0; i<a.length; i++) total[i] = a[i] * 3.14;
	
		return total;
	}
	
	
	public static void main (String[] args) {
		double[] array = {1, 2, 3, 4, 5, 6}, escalar = new double [array.length];
		
		escalar = Escalar3_14(array);
		
		for (int j=0; j<array.length; j++) System.out.println(escalar[j]);
	}
}