/* Escribir un método que dadas dos matrices de dobles devuelva una nueva matriz que
represente el producto de las matrices que se le pasaron.*/

public class Ejercicio34 {
	public static void ProdMatrices (double[][] matriz1, double[][] matriz2) {
		double[][] total = new double[matriz1.length][matriz2[0].length];
		
		if (matriz1[0].length != matriz2.length) {
			if ((matriz1.length == 2) && (matriz2[0].length == 2)) {
				total[0][0] = matriz1[0][0] * matriz2[0][0];
				total[0][1] = matriz1[0][0] * matriz2[0][1];
				total[1][0] = matriz1[0][1] * matriz2[0][0];
				total[1][1] = matriz1[0][1] * matriz2[0][1];
			}
			else {
				System.out.println("Las matrices no son multiplicables entre si");
			}
		}
		else {
			for (int i=0; i<matriz1.length; i++) {
				for (int j=0; j<matriz2[0].length; j++) {
					for (int k=0; k<matriz2.length; k++) {
						total[i][j] += matriz1[i][k] * matriz2[k][j];
					}
				}
			}
			
			for (int i=0; i<total.length; i++) {
				for (int j=0; j<total[i].length; j++) {
					System.out.printf("%.2f", total[i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}	
		}
	}
	
	public static void main (String[] args) {
		//double[][] a = {{2},{-1}}, b = {{3,5}};
		//double[][] a = {{2,0},{1,3}}, b = {{-1,-1},{5,6}};
		double[][] a = {{1,2},{-1,0},{-3,-1}}, b = {{2,0,1},{-5,2,3}};
		
		ProdMatrices(a,b);
	}
}

/*
https://www.matesfacil.com/matrices/resueltos-matrices-producto.html
https://www.vitutor.com/algebra/matrices/producto.html
*/