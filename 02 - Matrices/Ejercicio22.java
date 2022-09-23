/*Escribir un método que dada una matriz de enteros devuelva 
 * la fila que contiene el máximo elemento de la matriz.*/

public class Ejercicio22 {
	public static int FilaMaxMatrix (int[][] a) {
		
		int fila=0, aux=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] > aux) {
					aux = a[i][j];
					fila = i;
				}
			}
		}
		
		return fila;
	}
	
	public static void main (String[] args) {
		int[][] matriz = {{1,1,1},{1,5,9},{1,6,1}};
		int total = FilaMaxMatrix(matriz);
		System.out.println(total);
	}
}
