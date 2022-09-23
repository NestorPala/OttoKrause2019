/*Escribir un método que dada una matriz de enteros devuelva 
 * la columna que contiene el máximo elemento de la matriz. */

public class Ejercicio23 {
	public static int ColMaxMatrix (int[][] a) {
		
		int col=0, aux=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] > aux) {
					aux = a[i][j];
					col = j;
				}
			}
		}
		
		return col;
	}
	
	public static void main (String[] args) {
		int[][] matriz = {{1,1,1},{1,5,9},{1,6,1}};
		int total = ColMaxMatrix(matriz);
		System.out.println(total);
	}
}