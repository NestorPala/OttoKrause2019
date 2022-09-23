package ar.edu.ottokrause.psr.prodcons;

import java.util.concurrent.Semaphore;

public class Application {

	public static void main(String[] args) {
		final int ITEM_COUNT = 10;

		int[] buffer = new int[3];
		Indexer indexer = new Indexer(-1);
		Semaphore semaphore = new Semaphore(1);

		Producer producer = new Producer(semaphore, ITEM_COUNT, buffer, indexer);
		Consumer consumer = new Consumer(semaphore, ITEM_COUNT, buffer, indexer);

		consumer.start();
		producer.start();

		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
