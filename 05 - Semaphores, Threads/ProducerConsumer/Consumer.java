package ar.edu.ottokrause.psr.prodcons;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread {

	private int amountToConsume;
	private Indexer indexer;
	private int[] values;
	private Semaphore semaphore;

	public Consumer(Semaphore semaphore, int amountToConsume, int[] values, Indexer indexer) {
		this.amountToConsume = amountToConsume;
		this.indexer = indexer;
		this.semaphore = semaphore;
		this.values = values;
	}

	@Override
	public void run() {
		int remainingItems = this.amountToConsume;

		while (remainingItems > 0) {
			if (this.hasItemsToConsume()) {
				try {
					this.semaphore.acquire();

					if (this.hasItemsToConsume()) {
						int consumedValue = this.values[this.indexer.getIndex()];

						System.out.println("Consumer: " + consumedValue);

						this.indexer.decrement();

						remainingItems--;
					}

					this.semaphore.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private boolean hasItemsToConsume() {
		return 0 <= this.indexer.getIndex();
	}
}
