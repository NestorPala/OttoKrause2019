import java.util.concurrent.Semaphore;

public class Thread2 extends Thread {
	private Semaphore x, y, a1, b1;
	
	public Thread2 (Semaphore x, Semaphore y, Semaphore a1, Semaphore b1) {
		this.x = x;
		this.y = y;
		this.a1 = a1;
		this.b1 = b1;
	}
	
	public void run () {
		while (true) {
			
			try {
				this.b1.acquire();
				this.y.acquire();
				this.y.acquire();
				this.y.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("B");
			
			this.x.release();
			this.x.release();
			this.x.release();
		}
	}
}