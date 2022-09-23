/*
 * Ejercicio 7:
Crear una clase IntegerArrayList que implemente la interfaz IntegerList utilizando arreglos como el
medio de almacenamiento subyacente. Al momento de agregarse un elemento de una instancia
de IntegerArrayList, el arreglo que contiene los elementos debe ser copiado a uno nuevo que
tenga lugar para almacenar el nuevo elemento que se desea agregar.
 */


package ar.edu.ottokrause.psr.collections;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayList implements IntegerList {
	private Integer[] data;
	
	public IntegerArrayList() {
		this.data = new Integer[1];
	}
	
	
	// Crea el arreglo ( ej. IntegerArrayList a = new IntegerArrayList(12); )
	public IntegerArrayList (int size) {
		if (size < 0) {
			throw new IllegalArgumentException("El tamaño tiene que ser mayor a 0");
		}
		this.data = new Integer[size];
	}
	
	/////////////////////
	
	// Agrega un objeto Integer "element" a la lista
	public void add (Integer element) {	
		if (this.size() == 1 && this.get(0) == null) {
			this.data[0] = element;
		}
		else {
			this.resize(this.size() + 1);
			this.data[this.size()-1] = element;
		}
	}
	
	
	// Inserta el elemento "element" de tipo Integer en la posicion "index" de la lista
	public void add (int index, Integer element) {
		this.resize(this.size() + 1);
		
		for (int i=this.size()-1; i>index; i--) {
			this.data[i] = this.get(i-1);
		}
		
		this.data[index] = element;
	}
	
	
	/*Anexa todos los elementos de la lista de Integers "aList" especificada al final de ésta lista, 
	  en el orden en que aparecen. Devuelto por el iterador de la colección especificada */
	public void addAll (List<Integer> b) { //era boolean, no se por qué
		int a = this.size();
		this.resize(this.size() + b.size());
		
		for (int i=0; i<b.size(); i++) {
			this.set(a+i, b.get(i));
		}
	}
	
	
	// Inserta todos los elementos de la lista de Integers "aList", en ésta lista, en la posición "index" especificada.
	public void addAll (int index, List<Integer> aList) { //era boolean, no se por qué
		
		this.resize(this.size() + aList.size());
		
		for (int i=this.size()-1; i>=index+aList.size(); i--) {
			this.set(i, this.get(i-aList.size()));
		}
		
		for (int j=0; j<aList.size(); j++) {
			this.set(index + j, aList.get(j));
		}
	}
	
	
	// Borra todos los elementos de ésta lista
	public void clear() {
		this.resize(1);
		this.set(0, null);
	}
	
	
	// Devuelve "true" si esta lista contiene el elemento "element" especificado
	public boolean contains (Integer element) {
		boolean aux = false;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = true;
				break;
			}
		}
		return aux;
	}
	
	
	// Devuelve el elemento que se encuentra en la posición "index" de esta lista
	public Integer get (int index) {
		return this.data[index];
	}
	

	// Devuelve la primera posición de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra
	public int indexOf (Integer element) {
		int aux = -1;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = i;
				break;
			}
		}
		return aux;
	}
	
	
	// Devuelve "true" si la lista no contiene elementos
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
	
	
	// Devuelve la última posición de esta lista en la que aparece el elemento "element" especificado, o -1 si no se encuentra
	public int lastIndexOf (Integer element) {
		int aux = -1;
		for (int i=0; i<this.size(); i++) {
			if (this.get(i) == element) {
				aux = i;
			}
		}
		return aux;
	}
	
	
	// Elimina el elemento de la posición "index" de esta lista (Achica la lista en 1)
	public void remove (int index) {
		for (int i=index; i<this.size()-1; i++) {
			this.set(i, this.get(i+1));
		}
		this.resize(this.size() - 1);
	}
	
	
	//Establece un elemento en esa posicion de la lista
	public void set (int index, Integer element) {
		this.data[index] = element;
	}
	
	
	// Devuelve la cantidad de elementos (ancho) de esta lista
	public int size() {
		return this.data.length;
	}
	
	
	// Devuelve lo que hay entre la posición "fromIndex" inclusive y "toIndex" exclusive de esta lista
	public List<Integer> subList (int fromIndex, int toIndex) {
		List<Integer> aux = new ArrayList<Integer>();
		
		for (int i=0; i<(toIndex - fromIndex); i++) {
			aux.add(i, this.get(fromIndex + i));
		}
		
		return aux;
	}
	
	
	// Devuelve un arreglo que contenga todos los elementos de esta lista de forma ordenada
	@Override
	public Integer[] toArray() {
		return this.data;
	}
	
	
	
	//----------------------------------------
	//Metodos propios de esta clase
	
	private void resize (int newSize) {
		
		//CREAR INSTRUCCIONES PARA COMPROBAR TAMAÑO DE NEWSIZE (SI SON IGUALES RETURN)
		
		Integer[] newData = new Integer[newSize];
		
		for (int index=0; index<Math.min(this.size(), newSize); index++) {
			newData[index] = this.data[index];
		}
		
		this.data = newData; //HACE QUE LA VARIABLE "DATA" APUNTE AL OBJETO QUE TENÍA LA ETIQUETA "NEWDATA"
	}
	
	
	
	public static void main (String[] args) {
		IntegerArrayList a = new IntegerArrayList();
		
		a.add(34);
		a.add(35);
		a.add(36);
		a.add(37);
		a.add(38);
		
		a.add(2, 35);
		a.add(3, 35);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(81);
		b.add(82);
		b.add(83);
		
		//a.addAll(b);
		//a.addAll(2, b);
		
		//a.clear();
		
		System.out.println(a.contains(35));
		a.remove(2);
		a.set(2, 39);
		
		List<Integer> c = new ArrayList<Integer>();
		c = a.subList(1, 5);

		for (int i=0; i<a.size(); i++) System.out.print(a.get(i) + " ");
		System.out.println("");
		for (int i=0; i<a.size(); i++) System.out.print(c.get(i) + " ");
	}
}
