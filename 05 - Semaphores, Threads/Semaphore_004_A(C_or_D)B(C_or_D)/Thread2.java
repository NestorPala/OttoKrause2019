import java.util.concurrent.Semaphore;

public class Thread2 extends Thread {
	private Semaphore w,x,e1,e2,e3;
	
	public Thread2 (Semaphore w, Semaphore x, Semaphore e1, Semaphore e2, Semaphore e3) {
		this.w = w;
		this.x = x;
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	public void run () {
		for (int i=0; i<500; i++) {
			try {
				this.e3.acquire();
				this.x.acquire();
				this.x.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("B");
			
			this.e1.release();
			
			try {
				this.e2.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}