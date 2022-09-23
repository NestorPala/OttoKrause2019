/*Crear dos arreglos de enteros de N elementos cada uno. Generar e imprimir por pantalla 
 * un tercer arreglo que contenga los elementos de posiciones impares del primer arreglo 
 * y los de posiciones pares del segundo arreglo. */

public class Ejercicio05 {
	public static int[] TercerArreglo (int[] array1, int[] array2, int size) {
		
		//array1 --> comprueba los impares
		//array2 --> comprueba los pares
		
		int[] total = new int[size];
		int i, j;

		for (i=0; i<array1.length; i++) {
			if ((i%2)==1) {
				total[i]=array1[i];
			}
		}
		
		for (i=0; i<array2.length; i++) {
			if ((i%2)==0) {
				total[i]=array2[i];
			}
		}
		
		return total;
	}
	
	public static void main (String[] args) {
		int tam=10, z;
		int[] union = new int[tam];
		int[] a = {0, 86, 0, 86, 0, 86, 0, 86, 0, 86};
		int[] b = {32, 0, 32, 0, 32, 0, 32, 0, 32, 0};
		
		union = TercerArreglo(a, b, tam);
		
		for (z=0; z<tam; z++) {
			System.out.println(union[z]);
		}
	}
}
