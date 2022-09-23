/*Escribir un método que dada una matriz de enteros rote la matriz a izquierda. Se define rotar
la matriz a izquierda como la operación que mueve cada uno de los elementos de la matriz una
posición a la izquierda. En caso de que un elemento al ser movido a la izquierda no tenga lugar
en la fila en la que se encontraba originalmente, el mismo debe ser puesto en la última
posición de la fila anterior. En caso que el elemento que no tiene lugar en la fila se encontrara
en la primera fila, el mismo debe ser llevado a la última posición de la última fila.*/

public class Ejercicio31 {
	
	public static void RotarMatriz (int[][] matriz) {
		
		////////////////////////CREAR Y LLENAR AUXILIARES
		
		int[] colaux = new int[matriz.length - 1];
		int casaux = matriz[0][0];
		
		
		for (int i=1; i<matriz.length; i++) {
			colaux[i-1] = matriz[i][0];
		}
		
	
		////////////////////////REEMPLAZAR NUMEROS
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length - 1; j++) {
				matriz[i][j] = matriz[i][j+1];
			}
		}
		
		for (int i=0; i<matriz.length - 1; i++) {
			matriz[i][matriz[i].length - 1] = colaux[i];
		}
		
		matriz[matriz.length - 1][matriz[matriz.length - 1].length - 1] = casaux;

		////////////////////////MOSTRAR
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
	}
	
	
	public static void main (String[] args) {
		int[][] a = {{10,11,12,13},{14,15,16,17},{18,19,20,21}};
		//int[][] b = {{1,2},{3,4}};
		
		try {
             while(true){
                Thread.sleep(1000);
                RotarMatriz(a);
                for (int i=0; i<6; i++) System.out.println("");
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
	}
}