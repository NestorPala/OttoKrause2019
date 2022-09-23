package ar.edu.ottokrause.psr.prodcons;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Producer extends Thread {

	private int amountToProduce;
	private Indexer indexer;
	private int[] values;
	private Semaphore semaphore;

	private Random random;

	public Producer(Semaphore semaphore, int amountToProduce, int[] values, Indexer indexer) {
		this.amountToProduce = amountToProduce;
		this.indexer = indexer;
		this.semaphore = semaphore;
		this.values = values;

		this.random = new Random();
	}

	@Override
	public void run() {
		int remainingItems = this.amountToProduce;

		while (remainingItems > 0) {
			if (this.canProduce()) {
				try {
					this.semaphore.acquire();

					if (this.canProduce()) {
						int producedValue = this.produceValue();

						// Se incrementa primero, debido a que el índice comienza
						// con el valor -1. Caso contrario, se generaría una excepción.
						this.indexer.increment();

						this.values[this.indexer.getIndex()] = producedValue;

						System.out.println("Producer: " + producedValue);

						remainingItems--;
					}

					this.semaphore.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private boolean canProduce() {
		// Se verifica contra this.values.length - 1 porque primero se
		// incrementa el valor del contador y luego se accede a la posición del arreglo.
		return this.indexer.getIndex() < this.values.length - 1;
	}

	private int produceValue() {
		return this.random.nextInt(10000);
	}
}
