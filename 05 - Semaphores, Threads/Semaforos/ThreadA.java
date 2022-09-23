import java.util.concurrent.Semaphore;

public class ThreadA extends Thread {
	private Semaphore x;
	
	public ThreadA (Semaphore x) {
		this.x = x;
	}
	
	@Override
	public void run () {
		for (int i=0; i<1000; i++) {
			
			//ADAPTACION PARA EVITAR INTERRUPTED EXCEPTION
			try {
				this.x.acquire();
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			
			System.out.println("ThreadA");
			
			
			this.x.release();
		}
	}
}


//P(X) ==> x.adquire();
//V(X) ==> x.release();