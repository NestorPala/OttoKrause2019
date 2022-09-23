/*Escribir un método que dada una matriz de enteros devuelva 
 * la posición que contiene el máximo elemento de la matriz.*/


public class Ejercicio24 {
	public static int[] PosMaxMatrix (int[][] a) {
		
		int[] pos = {0, 0};
		int aux=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] > aux) {
					aux = a[i][j];
					pos[0] = i;
					pos[1] = j;
				}
			}
		}
		
		return pos;
	}
	
	public static void main (String[] args) {
		int[][] matriz = {{1,1,1},{1,5,9},{1,6,1}};
		int[] total = PosMaxMatrix(matriz);
		System.out.println(total[0] + "," + total[1]);
	}
}