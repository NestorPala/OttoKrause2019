package ar.edu.ottokrause.psr.collections;

import java.util.List;

public class IntegerNode {
	private Integer value;
	private IntegerNode next;
	private IntegerNode previous;

	public IntegerNode() {
	}
	
	public IntegerNode(Integer value) {
		this.value = value;
	}
	
	public IntegerNode(IntegerNode next) {
		this.next = next;
	}
	
	public IntegerNode(IntegerNode next, Integer value) {
		this.next = next;
		this.value = value;
	}
	
	public IntegerNode(IntegerNode next, IntegerNode previous) {
		this.next = next;
		this.previous = previous;
	}
	
	public IntegerNode(IntegerNode next, Integer value, IntegerNode previous) {
		this.next = next;
		this.value = value;
		this.previous = previous;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public IntegerNode getNext() {
		return this.next;
	}
	
	public void setNext(IntegerNode next) {
		this.next = next;
	}
	 
	public IntegerNode getPrevious() {
		return this.previous;
	}
	
	public void setPrevious(IntegerNode previous) {
		this.previous = previous;
	}
	
	public static void main (String[] args) {
		IntegerNode a = new IntegerNode(12);
		IntegerNode b = new IntegerNode(13);
		IntegerNode c = new IntegerNode(14);
		
		a.setNext(b);
		a.setNext(c);
		a.setNext(null);
		
		System.out.println(a.getNext());
	}
}
