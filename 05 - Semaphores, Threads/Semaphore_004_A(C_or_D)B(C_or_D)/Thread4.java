import java.util.concurrent.Semaphore;

public class Thread4 extends Thread {
	private Semaphore w,x,e1,e2,e3;
	
	public Thread4 (Semaphore w, Semaphore x, Semaphore e1, Semaphore e2, Semaphore e3) {
		this.w = w;
		this.x = x;
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	public void run () {
		for (int i=0; i<500; i++) {
			try {
				this.e1.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("D");
			
			this.w.release();
			this.x.release();
			this.e3.release();
			this.e2.release();
		}
	}
}