/*Crear un arreglo boléanos de N elementos. Calcular e imprimir por pantalla el producto 
 *de la cantidad de los elementos que en una posición par del arreglo son true por la 
 *cantidad de elementos que en posición impar son false.  */


public class Ejercicio04 {
	
	public static int ProdTrueFalse (boolean[] a) {
		int i, par_true=0, impar_false=0;
		
		for (i=0; i<a.length; i++) {
			if ((i % 2)==0){ 			//si es par
				if (a[i]==true){
					par_true++;
				}
			}
			else { 						//si es impar
				if (a[i]==false) {
					impar_false++;
				}
			}
		}
		return par_true * impar_false;
	}
	
	public static void main (String[] args) {
		int total;
		boolean[] x = {true, false, true, false};
		
		total = ProdTrueFalse(x);
		System.out.println("Resultado: " + total);	
	}
}
