
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
		this.index += amount;
	}
}
