/* Escribir un método que dada una matriz de enteros devuelva la 
 * cantidad de elementos positivos que contiene la matriz. */

public class Ejercicio19 {
	public static int CantPosMatrix (int[][] a) {
		int contador=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j]>0) contador++;
			}
		}
		
		return contador;
	}
	
	public static void main (String[] args) {
		int[][] matriz = {{1,2,3},{-1,-2,-3},{4,-5,6}};
		
		int posi = CantPosMatrix(matriz);
		
		System.out.println(posi);
	}
}