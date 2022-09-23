/*Escribir un método que dada una matriz de enteros y un entero que 
 * representa un índice de columna, devuelva la fila que contiene el 
 * máximo elemento de esa columna. */

public class Ejercicio21 {
	public static int FilaMaxNum (int[][] a, int col) {
		
		int fil=0;
		
		for (int i=1; i<a.length; i++) {
			if (a[i][col] > a[i-1][col]) fil=i;
		}
		
		return fil;
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = {{1,1,2,1}, {1,1,1,1}, {1,1,0,1}, {1,1,5,1}};
		int c=2, f=0;
		
		f = FilaMaxNum(matriz, c);
		
		System.out.println(f);
	}
}