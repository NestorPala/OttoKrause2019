/*Escribir un método que dada una matriz de enteros y un entero que 
 * representa un índice de fila, devuelva la suma de los elementos 
 * de esa fila. */

public class Ejercicio26 {
	public static int SumaNumFila (int[][] matriz, int fila) {
		int total=0;
		for (int i=0; i<matriz[fila].length; i++) {
			total += matriz[fila][i];
		}
		
		return total;
	}
	
	public static void main (String[] args) {
		int[][] a = {{1,1,1},{1,5,9},{1,6,1}};
		int b = 1;
		int total = SumaNumFila(a, b);
		System.out.println(total);
	}
}
