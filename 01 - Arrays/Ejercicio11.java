/*Crear un arreglo de enteros de N elementos. Ingresar un n�mero y 
 * buscarlo en el arreglo.Imprimir por pantalla la posici�n del n�mero 
 * si �ste se encuentra en el arreglo. En caso contrario imprimir por 
 * pantalla el mensaje: �El n�mero buscado no se encuentra en el 
 * arreglo�.*/


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