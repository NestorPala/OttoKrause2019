/*Escribir un método que dada una matriz de enteros y un entero,
 *devuelva la posición de la matriz en la que se encuentra ese 
 *entero, o un valor que indique que el entero no se encuentra 
 *en la matriz*/

public class Ejercicio25 {
	public static int[] MatrizNumPos (int[][] matriz, int num) {
		
		int[] res = new int[2];
		int aux = 0;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					aux++;
					res[0] = i;
					res[1] = j;
				}
			}
		}
		
		if(aux>0) {
			return res;
		}
		else {
			res[0] = -1;
			res[1] = -1;
			return res;
		}
	}
	
	public static void main (String[] args) {
		int[][] a = {{1,1,1},{1,5,9},{1,6,1}};
		int b = 5;
		int[] pos = MatrizNumPos(a, b);
	
		if (pos[0]!=-1 && pos[1]!=-1)
			System.out.println("(" + pos[0] + "," + pos[1] + ")");
		else
			System.out.println("No está el número");
	}
}
