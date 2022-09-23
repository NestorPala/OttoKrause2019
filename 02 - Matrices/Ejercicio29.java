/*Escribir un método que dada una matriz de enteros y dos enteros que 
 * representan índices de columna, intercambie las columnas 
 * correspondientes de la matriz.*/

public class Ejercicio29 {
	public static void CambioCol (int[][] matriz, int col1, int col2) {
		int[] colaux = new int[matriz.length];
		
		int i=0;
		
		for (i=0; i<matriz.length; i++) {
			colaux[i] = matriz[i][col1];
		}
		
		for (i=0; i<matriz.length; i++) {
			matriz[i][col1] = matriz[i][col2];
		}
		
		for (i=0; i<matriz.length; i++) {
			matriz[i][col2] = colaux[i]; 
		}
		
		return;
	}
	
	public static void main (String[] args) {
		int[][] a = {{1,1,1},{1,5,9},{1,6,1}};
		int num1=1, num2=2;
		CambioCol(a, num1, num2);
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}