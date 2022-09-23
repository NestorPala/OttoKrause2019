import java.util.Random;
import java.util.concurrent.Semaphore;

public class Par extends Thread {
	private static int fill_value = 0;
	
	private int[] buffer;
	private Indexer indexer;
	private Semaphore a;
	
	
	public Par (int[] buffer, Indexer indexer, Semaphore a) {
		this.buffer = buffer;
		this.indexer = indexer;
		this.a = a;
	}
	
	
	public void run () {
		while (this.isWithinBounds()) {
			try {
				this.a.acquire();
				
				if (this.isWithinBounds()) {
					this.buffer[this.indexer.getIndex()] = fill_value;
					
					System.out.println("Thread 1: " + this.buffer[this.indexer.getIndex()]);
					
					fill_value += 2;
					
					this.indexer.increment();
				}
				
				this.a.release();

				this.delay();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private boolean isWithinBounds() {
		return this.indexer.getIndex() < this.buffer.length;
	}
	
	
	private void delay() throws InterruptedException {
		Random random = new Random();
		
		double value = random.nextDouble();
		
		if (value > 0.9) {
			int delay = random.nextInt(500) + 100;
			
			Thread.sleep(delay);
		}
	}
}
