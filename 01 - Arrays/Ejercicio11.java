/*Crear un arreglo de enteros de N elementos. Ingresar un número y 
 * buscarlo en el arreglo.Imprimir por pantalla la posición del número 
 * si éste se encuentra en el arreglo. En caso contrario imprimir por 
 * pantalla el mensaje: “El número buscado no se encuentra en el 
 * arreglo”.*/


public class Ejercicio11 {
	public static int find (int[] array, int num) {
		
			for(int i=0; i<array.length; i++) {
				if(num==array[i]){
					return i;
				}
			}
			
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 4, 7, 6};
		int number = 1;
		int total = find(array, number);
		
			if(total==-1) {
				System.out.println("El numero ingresado no esta en el arreglo");
			}
			else {
				System.out.println("El numero ingresado se encuentra en la posicion: " + total);
			}
	}
}