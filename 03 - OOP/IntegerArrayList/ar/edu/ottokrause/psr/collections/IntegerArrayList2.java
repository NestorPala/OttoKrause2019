/*
 * Ejercicio 8:
Modificar la clase IntegerArrayList del ejercicio anterior o crear una clase IntegerArrayList2 que
implemente la interfaz IntegerList utilizando arreglos como el medio de almacenamiento
subyacente. 


En este caso, se debe reservar más espacio que el requerido a priori, de manera tal
que no sea necesario copiar el arreglo cada vez que el usuario de la clase quiera agregar un
elemento al final de la lista.
 */

package ar.edu.ottokrause.psr.collections;

import java.util.ArrayList;
import java.util.List;



public class IntegerArrayList2 {
	private Integer[] data;
	private int size;
	
	public IntegerArrayList2() {
		this.data = new Integer[999999999];
	}
	
	public IntegerArrayList2 (int size) {
		this.size = size;
	}
	
	
	/*Establece un elemento "element" en una posición "index" de esta lista*/
	public void set(int index, Integer element) {
		this.data[index] = element;
	}
	
	/*Devuelve el elemento que se encuentra en la posición "index" de esta lista*/
	public Integer get(int index) {
		return this.data[index];
	}
	
	/*Devuelve la cantidad de elementos (ancho) de esta lista*/
	public int size() {
		return this.data.length;
	}
	
	/*Borra todos los elementos de ésta lista */
	public void clear() {
		for (int i=0; i<this.size(); i++) {
			if (this.get(i)!=null) {
				this.set(i, null);
			}
		}
	}
	
	/*Devuelve "true" si la lista no contiene elementos*/
	public boolean isEmpty() {
		boolean aux = true;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) != null) {
				aux = false;
				break;
			}
		}
		return aux;
	}

	/*Devuelve "true" si esta lista contiene el elemento "element" especificado*/
	public boolean contains(Integer element) {
		boolean aux = false;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = true;
				break;
			}
		}
		return aux;
	}

	/*Devuelve la primera posición de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra */
	public int indexOf(Integer element) {
		int aux = -1;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = i;
				break;
			}
		}
		return aux;
	}
	
	/*Devuelve la última posición de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra */
	public int lastIndexOf(Integer element) {
		int aux = -1;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = i;
			}
		}
		return aux;
	}
	
	
	/*Devuelve lo que hay entre la posición "fromIndex" inclusive y "toIndex" exclusive de esta lista*/
	public List<Integer> subList(int fromIndex, int toIndex) {
		
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	
	/*Agrega un objeto Integer "element" a la lista (al final)*/
	public void add(Integer element) {
		
	}
	
	
	/*Inserta el elemento "element" de tipo Integer en la posicion "index" de la lista*/
	public void add(int index, Integer element) {
		
	}
	
	/*Anexa todos los elementos de la lista de Integers "aList" especificada al final de ésta lista, 
	  en el orden en que aparecen. Devuelto por el iterador de la colección especificada */
	public void addAll(List<Integer> aList) {
		
	}
	
	
	/*Inserta todos los elementos de la lista de Integers "aList", en ésta lista, en la posición "index" especificada.*/
	public void addAll(int index, List<Integer> aList) {
		
	}
	
	/*Elimina el elemento de la posición "index" de esta lista*/
	public void remove(int index) {
		
	}
	
	
	/*Devuelve un arreglo que contenga todos los elementos de esta lista de forma ordenada*/
	public Integer[] toArray() {
		
	}
	
	
	
	public static void main (String[] args) {
		
	}
}
