/*Crear dos arreglos de enteros de N elementos cada uno. Si el primer arreglo se 
 * referencia con la variable A y el segundo arreglo se referencia con la variable B. 
 * Generar e imprimir por pantalla un tercer arreglo en el cual sus elementos están 
 * dados por la siguiente fórmula: C(i) = A(i) * B(N – i), si C es el nombre de la 
 * variable que referencia al tercer arreglo. */

public class Ejercicio06 {
	public static int[] multi (int[] A, int[] B, int size) {
		
		int[] C = new int[size];
		int i;
		
		for (i=1; i<=size; i++) {
			C[i-1] = A[i-1] * B[size - i];
		}
		
		return C;
	}
	
	public static void main (String[] args) {
		int tam=5, j;
		int[] x = {12, 24, 36, 48, 60};
		int[] y = {2, 3, 4, 5, 6};
		int[] total = multi(x, y, tam); 
		
		
		System.out.println("El resultado de A[i] * B[N - i] es:");
		
		for (j=0; j<tam; j++) System.out.println(total[j]);
	}
}