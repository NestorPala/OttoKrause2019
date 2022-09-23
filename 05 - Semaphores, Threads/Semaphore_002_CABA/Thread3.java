import java.util.concurrent.Semaphore;

public class Thread3 extends Thread {
	private Semaphore x, y, z, c1;
	
	public Thread3 (Semaphore x, Semaphore y, Semaphore z, Semaphore c1) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.c1 = c1;
	}
	
	public void run () {
		while (true) {
			try {
				this.z.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("B");
			
			this.y.release();
		}
	}
}
