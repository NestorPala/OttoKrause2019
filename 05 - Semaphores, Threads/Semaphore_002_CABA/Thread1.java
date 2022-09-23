import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {
	private Semaphore x, y, z, c1;
	
	public Thread1 (Semaphore x, Semaphore y, Semaphore z, Semaphore c1) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.c1 = c1;
	}
	
	public void run () {
		while (true) {
			try {
				this.c1.acquire();
				this.x.acquire();
				this.x.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("C ");
			
			this.c1.release();
			this.y.release();
			this.z.release();
		}
	}
}
