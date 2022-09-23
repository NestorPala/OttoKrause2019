/*Crear un arreglo de enteros de N elementos. Verificar en imprimir por pantalla si todos sus
elementos se encuentran en orden estrictamente creciente. */

public class Ejercicio16 {
	public static boolean VerifAsc (int[] array) {
		
		for (int i=0; i<(array.length-1); i++) {
			if (array[i] > array[i+1]) return false;
		}
		
		return true;
	}
	
	public static void main (String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		boolean b = VerifAsc(a);
		System.out.println(b);
	}
}