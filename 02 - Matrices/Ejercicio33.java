/*Escribir un método que dadas dos matrices de dobles devuelva una nueva matriz que
represente la resta de las matrices que se le pasaron.*/

public class Ejercicio33 {
	public static void RestaMatrices (double[][] matriz1, double[][] matriz2) {
		double[][] total = new double[matriz1.length][matriz1.length];
		
		for (int i=0; i<total.length; i++) {
			for (int j=0; j<total[i].length; j++) {
				total[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}

		for (int i=0; i<total.length; i++) {
			for (int j=0; j<total[i].length; j++) {
				System.out.printf("%.2f", total[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		return;
	}
	
	public static void main (String[] args) {
		double[][] a = {{2.5, 3},{4.5, 6}}, b = {{3.5, 4},{3.5, 3}};
		RestaMatrices(a, b);
	}
}