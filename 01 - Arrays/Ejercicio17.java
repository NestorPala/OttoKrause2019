/*Crear un arreglo de enteros de N elementos. Verificar si los elementos se encuentran en orden
estrictamente creciente. Si los elementos no se encuentran en orden estrictamente creciente,
imprimir por pantalla la cantidad de veces que se rompe ese orden.
Ejemplo: { 1, 3, 5, 2, 4, 6, 8, 8, 9, 10}, el número de veces que se rompe el orden es 2.
*/

public class Ejercicio17 {
	
    public static void VerifAsc (int[] array) {
        int cont=0;
        
        for (int i=0; i<(array.length-1); i++) {
            if (array[i] > array[i+1]) cont++;
        }
        
        if(cont>0){ 
        	System.out.println("El arreglo no esta en orden ascendente y la cantidad de veces que se rompe el ciclo es: " + cont);
        }
        else {
        	System.out.println("El arreglo esta ordenado de forma ascendente");
        }
    }
    
    
    public static void main(String[]args) {
        int[]a={1,2,3,4};
        VerifAsc(a);
    }
}