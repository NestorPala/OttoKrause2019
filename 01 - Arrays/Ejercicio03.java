/*Crear un arreglo de N elementos enteros. Imprimir por pantalla el mensaje: 
 * “Todos positivos” si todos sus elementos son positivos. En caso contrario imprimir 
 * por pantalla el mensaje: “No todos positivos”. Nota: se debería utilizar una única 
 * sentencia if en la impresión del mensaje por pantalla.  */


public class Ejercicio03 {
	public static boolean positivos (int[] array) {
		int i, cont=0;
		
		for (i=0; i<array.length; i++) {
			if (array[i] > 0) {
				cont++;
			}
		}
		
		if (cont==array.length) return true; else return false;
	}
	
	public static void main (String[] args) {
		boolean posi;
		int[] a = {1, 2, 3, 4, 5};
		posi = positivos(a);
		
		if (posi) System.out.println("Todos positivos");
		else System.out.println("No todos positivos");
	}
}
