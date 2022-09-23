import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {
	private Semaphore x, y, a1, b1;
	
	public Thread1 (Semaphore x, Semaphore y, Semaphore a1, Semaphore b1) {
		this.x = x;
		this.y = y;
		this.a1 = a1;
		this.b1 = b1;
	}
	
	public void run () {
		while (true) {
			
			
			try {
				this.a1.acquire();
				this.x.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("A");
			
			this.y.release();
			this.a1.release();
			this.b1.release();
		}
	}
}