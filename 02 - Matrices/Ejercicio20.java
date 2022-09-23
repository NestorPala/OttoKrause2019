/*Escribir un método que dada una matriz de enteros y un entero que 
 * representa un índice de fila, devuelva la columna que contiene el
 * máximo elemento de esa fila*/

public class Ejercicio20 {
	public static int ColMaxNum (int[][] a, int fila) {
		
		int col=0;
		
		for (int i=1; i<a[fila].length; i++) {
			if (a[fila][i] > a[fila][i-1]) col=i;
		}
		
		return col;
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = {{1,1,1}, {1,5,9}, {1,1,1}};
		int f=1, c=0;
		
		c = ColMaxNum(matriz, f);
		
		System.out.println(c);
	}
}