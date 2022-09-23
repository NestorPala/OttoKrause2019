/*Crear un arreglo de enteros de N elementos. Ordenarlo de manera ascendente. Ingresar un
número y buscarlo en el arreglo de manera eficiente aprovechando que los elementos del
arreglo se encuentran ordenados. */

public class Ejercicio13 {
	
	public static void burbuja(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[i] < array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	public static int buscar(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int numero = 2, total;
		int[] a = { 1, 3, 2, 4 };
		
		burbuja(a);
		total = buscar(a, numero);
		
		for (int i=0; i<a.length; i++) System.out.println(a[i]);
		
		if (total >= 0) System.out.println("El numero " + numero + " se encuentra en la posicion: " + total);
		else System.out.println("El numero no se encuentra en el arreglo");
	}
}