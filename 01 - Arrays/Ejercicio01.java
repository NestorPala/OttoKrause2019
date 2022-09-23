/* Crear un arreglo de N elementos enteros. Llenar el arreglo con N números enteros 
 * provistos por el usuario. Escribir una función que tome como parámetro el arreglo y 
 * devuelva la posición del elemento más chico del arreglo. Imprimir por pantalla el 
 * menor de los elementos del arreglo.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static int min (int[] array) {

        int min=0;

        for (int i=1; i<array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void main (String[] args) {
    	Scanner in = new Scanner(System.in);
    	int total=0, i, size=10;
    	int[] num = new int[size]; //inicializar todo en 0 sintaxis
    	
    	System.out.println("Ingrese 10 numeros");
    	
    	for (i=0; i<size; i++) {
    		System.out.println("Numero " + (i+1) + "/" + size);
    		num[i] = in.nextInt();
    	}
    	
    	total = min(num);
    
        System.out.println("La posicion del minimo es: " + total);
        System.out.println("El numero es: " + num[total]);
    }
}