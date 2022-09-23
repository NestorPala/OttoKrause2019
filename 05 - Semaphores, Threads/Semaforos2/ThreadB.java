
import java.util.concurrent.Semaphore;

public class ThreadB extends Thread {
	
	private static final Semaphore E2 = new Semaphore(1);

	private Semaphore x;
	private Semaphore y;
	
	public ThreadB (Semaphore x, Semaphore y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void run () {
		for (int i=0; i<500; i++) {
			try {
				ThreadB.E2.acquire(); //E2.acquire();
				this.y.acquire();
				this.y.acquire();
				ThreadB.E2.release();
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			System.out.println("B");
			
			this.x.release();
			this.x.release();
		}
	}
}

/* static: palabra reservada para crear "Variables de clase", es decir, que todas las instancias de esa clase 
leen el mismo valor, en vez de que cada uno tenga su propia copia */

/* final: palabra reservada para crear "variables constantes", es decir, que solo pueden apuntar a un objeto. 
Sin embargo, el objeto apuntado si puede cambiar de valor */