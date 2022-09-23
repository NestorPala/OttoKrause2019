/*Escribir un método que dada una matriz de enteros rote la matriz a derecha. Se define rotar la
matriz a derecha como la operación que mueve cada uno de los elementos de la matriz una
posición a la derecha. En caso de que un elemento al ser movido a la derecha no tenga lugar
en la fila en la que se encontraba originalmente, el mismo debe ser puesto en la primera
posición de la siguiente fila. En caso que el elemento que no tiene lugar en la fila se encontrara
en la última fila, el mismo debe ser llevado a la primera posición de la primera fila.
*/

public class Ejercicio30 {
	
	public static void RotarMatriz (int[][] matriz) {
		
		////////////////////////CREAR Y LLENAR AUXILIARES
		
		int[] colaux = new int[matriz.length - 1];
		int casaux = matriz[matriz.length - 1][matriz[matriz.length - 1].length - 1];
		
		
		for (int i=0; i<=matriz.length-2; i++) {
			colaux[i] = matriz[i][matriz[i].length - 1];
		}
		
		////////////////////////REEMPLAZAR NUMEROS
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=matriz[i].length - 1; j>0; j--) {
				matriz[i][j] = matriz[i][j-1];
			}
		}
		
		for (int i=1; i<matriz.length; i++) {
			matriz[i][0] = colaux[i-1];
		}
		
		matriz[0][0] = casaux;

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