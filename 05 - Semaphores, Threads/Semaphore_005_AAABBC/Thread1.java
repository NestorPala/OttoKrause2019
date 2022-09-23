import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {
	private Semaphore x,y,z,a1,b1,b2,c1;
	
	public Thread1 (Semaphore x, Semaphore y, Semaphore z, Semaphore a1, Semaphore b1, Semaphore b2, Semaphore c1) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a1 = a1;
		this.b1 = b1;
		this.b2 = b2;
		this.c1 = c1;
	}
	
	public void run () {
		for (int i=0; i<500; i++) {
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