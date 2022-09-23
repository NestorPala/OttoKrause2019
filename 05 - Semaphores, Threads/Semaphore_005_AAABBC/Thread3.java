import java.util.concurrent.Semaphore;

public class Thread3 extends Thread {
	private Semaphore x,y,z,a1,b1,b2,c1;
	
	public Thread3 (Semaphore x, Semaphore y, Semaphore z, Semaphore a1, Semaphore b1, Semaphore b2, Semaphore c1) {
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
				this.z.acquire();
				this.c1.acquire();
				this.c1.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("C");
			
			this.a1.release();
			this.x.release();
			this.x.release();
			this.x.release();
			
			try {
				this.b1.acquire();
				this.y.acquire();
				this.y.acquire();
				this.y.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.b2.release();
			this.b2.release();
		}
	}
}