/*Escribir un método que dada una matriz de enteros y dos enteros 
 * que representan índices de fila, intercambie las filas 
 * correspondientes de la matriz. */

public class Ejercicio28 {
	public static void CambioFilas (int[][] matriz, int fila1, int fila2) {
		int[] filaaux = new int[matriz[fila1].length];
		
		int i=0;
		
		for (i=0; i<matriz[fila1].length; i++) {
			filaaux[i] = matriz[fila1][i];
		}
		
		for (i=0; i<matriz[fila1].length; i++) {
			matriz[fila1][i] = matriz[fila2][i];
		}
		
		for (i=0; i<matriz[fila1].length; i++) {
			matriz[fila2][i] = filaaux[i]; 
		}
		
		return;
	}
	
	public static void main (String[] args) {
		int[][] a = {{1,1,1},{1,5,9},{1,6,1}};
		int num1=0, num2=1;
		CambioFilas(a, num1, num2);
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}