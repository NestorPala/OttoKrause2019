/* Crear un arreglo de enteros de N elementos. Imprimir por pantalla los elementos del arreglo
ordenados en forma ascendente. Luego, realizar lo mismo, pero ordenarlo de manera
descendente*/

public class Ejercicio12 {
	public static void AscDesc (int[] a) {
		
		int i, j, aux;
		int[] b = new int[a.length];
		
		for(i=1; i<a.length; i++) {
            for (j=0 ; j<a.length-1; j++) {
            	
                if (a[j] > a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
		
		for (i=0; i<a.length; i++) System.out.print(a[i] + " ");
		
		System.out.println("");
		
		for (i=0; i<a.length; i++) b[i] = a[(a.length-1) - i];
		for (i=0; i<a.length; i++) a[i] = b[i];
		
		for (i=0; i<a.length; i++) System.out.print(a[i] + " ");
	}
	
	
	public static void main (String[] args) {
		int[] array = {6, 9, 3, 12, 11};
		AscDesc(array);
	}
}
