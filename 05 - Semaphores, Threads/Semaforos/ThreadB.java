import java.util.concurrent.Semaphore;

public class ThreadB extends Thread {
	private Semaphore x;
	
	public ThreadB (Semaphore x) {
		this.x = x;
	}
	
	@Override
	public void run () {
		for (int i=0; i<1000; i++) {
			
			//ADAPTACIÓN PARA EVITAR INTERRUPTED EXCEPTION
			try {
				this.x.acquire();
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			
			System.out.println("ThreadB");
			
			
			this.x.release();
		}
	}
}


//P(X) ==> x.adquire();
//V(X) ==> x.release();