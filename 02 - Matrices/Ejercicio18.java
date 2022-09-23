//GUIA 2

/*Escribir un método que dada una matriz de enteros devuelva la 
 * suma de los elementos que contiene la matriz*/

public class Ejercicio18 {
	
	public static int SumaMatrix (int[][] a) {
		
		int total=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				total += a[i][j];
			}
		}
		return total;
	}
	
	
	public static void main (String[] args) {
		int[][] matriz = {{1,1,1},{1,1,1}};
		int suma=0;
		
		suma = SumaMatrix(matriz);
		
		System.out.println(suma);
			
	}
}

//int[][] matriz = new int[2][3];

//int [][] matriz = {{2,4,4},{6,6,9},{8,10,12}};


/*
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
			}
		}
*/