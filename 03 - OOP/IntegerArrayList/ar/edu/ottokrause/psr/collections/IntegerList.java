package ar.edu.ottokrause.psr.collections;
import java.util.List;

public interface IntegerList {
	/*Agrega un objeto Integer "element" a la lista (al final)*/
	void add(Integer element);
	
	/*Inserta el elemento "element" de tipo Integer en la posicion "index" de la lista*/
	void add(int index, Integer element);
	
	/*Anexa todos los elementos de la lista de Integers "aList" especificada al final de �sta lista, 
	  en el orden en que aparecen. Devuelto por el iterador de la colecci�n especificada */
	void addAll(List<Integer> aList);
	
	/*Inserta todos los elementos de la lista de Integers "aList", en �sta lista, en la posici�n "index" especificada.*/
	void addAll(int index, List<Integer> aList);
	
	/*Borra todos los elementos de �sta lista */
	void clear();
	
	/*Devuelve "true" si esta lista contiene el elemento "element" especificado*/
	boolean contains(Integer element);
	
	/*Devuelve el elemento que se encuentra en la posici�n "index" de esta lista*/
	Integer get(int index);

	/*Devuelve la primera posici�n de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra */
	int indexOf(Integer element);
	
	/*Devuelve "true" si la lista no contiene elementos*/
	boolean isEmpty();
	
	/*Devuelve la �ltima posici�n de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra */
	int lastIndexOf(Integer element);
	
	/*Elimina el elemento de la posici�n "index" de esta lista*/
	void remove(int index);
	
	/*Establece un elemento "element" en una posici�n "index" de esta lista*/
	void set(int index, Integer element);
	
	/*Devuelve la cantidad de elementos (ancho) de esta lista*/
	int size();
	
	/*Devuelve lo que hay entre la posici�n "fromIndex" inclusive y "toIndex" exclusive de esta lista*/
	List<Integer> subList(int fromIndex, int toIndex);
	
	/*Devuelve un arreglo que contenga todos los elementos de esta lista de forma ordenada*/
	Integer[] toArray();
}