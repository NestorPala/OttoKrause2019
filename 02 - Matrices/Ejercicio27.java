/*Escribir un método que dada una matriz de enteros y un entero que 
 * representa un índice de columna, devuelva la suma de los 
 * elementos de esa columna. */

public class Ejercicio27 {
	public static int SumaNumCol (int[][] matriz, int col) {
		int total=0;
		
		for (int i=0; i<matriz.length; i++) {
			total += matriz[i][col];
		}
		
		return total;
	}
	
	public static void main (String[] args) {
		int[][] a = {{1,1,1},{1,5,9},{1,6,1}};
		int b = 1;
		int total = SumaNumCol(a, b);
		System.out.println(total);
	}
}