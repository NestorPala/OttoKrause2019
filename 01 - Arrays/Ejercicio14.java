/*Crear un arreglo de enteros de N elementos. Luego, crear un arreglo de enteros de 2*N
elementos. Copiar todos los elementos del primer arreglo al segundo. Llenar las posiciones
restantes del segundo arreglo con el entero 10. Imprimir por pantalla los elementos del
segundo arreglo. */

public class Ejercicio14 {
	
    public static int[]Fillint (int[]array) {
    	
        int[] array2=new int[array.length*2];
        
        for(int i=0;i<array2.length;i++) {
            if(i<array.length){array2[i]=array[i];}
            if(i>=array.length){array2[i]=10;}
        }
        
        return array2;
    }
    
    public static void main(String[]args) {
    	
        int[]a={1,2,3};
        int[]b=Fillint(a);
        
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
