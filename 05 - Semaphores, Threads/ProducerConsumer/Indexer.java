package ar.edu.ottokrause.psr.prodcons;

public class Indexer {

	private int index;

	public Indexer() {
		this(0);
	}

	public Indexer(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

	public void increment() {
		this.increment(1);
	}

	public void increment(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException();
		}

		this.alter(amount);
	}

	public void decrement() {
		this.decrement(1);
	}
	
	public void decrement(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException();
		}

		this.alter(-amount);
	}

	private void alter(int amount) {
		this.index += amount;
	}
}
