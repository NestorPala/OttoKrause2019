/*Crear un arreglo de enteros de N elementos. Ordenarlo. Ingresar un entero e intercalarlo de
manera tal que el mismo quede ordenado. Imprimir el arreglo resultante por pantalla. */

public class Ejercicio15 {
	
    public static int[] burbuja (int[] array, int num) {
    	
        int[] array2 = new int[array.length + 1];
        int temp;
        
        for(int i=0; i<array2.length; i++){
            if(i < array.length)
            	array2[i] = array[i];
            else
            	array2[i] = num;
        }
        
        for(int i=1; i<array2.length; i++) {
            for (int j=0 ; j < array2.length-1; j++) {
            	
                if (array2[j] > array2[j+1]) {
                    temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;
                }
            }
        }
        
        return array2;
    }
    
    public static void main (String[] args) {
    	
        int numero = 3;
        int[]arreglo = {2,1,4};
        int[]arregloaux = new int[arreglo.length];
        
        arregloaux = burbuja(arreglo, numero);
        
        for(int i=0; i<arreglo.length+1; i++) System.out.println(arregloaux[i]);
    }
}