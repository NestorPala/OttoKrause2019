import java.util.concurrent.Semaphore;

public class ThreadA extends Thread {
	
	private static final Semaphore E1 = new Semaphore(1);

	private Semaphore x;
	private Semaphore y;
	
	public ThreadA (Semaphore x, Semaphore y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void run () {
		for (int i=0; i<500; i++) {
			try {
				this.x.acquire();
				ThreadA.E1.acquire(); //E1.acquire();
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			System.out.println("A");
			
			E1.release();
			this.y.release();
		}
	}
}

/* static: palabra reservada para crear "Variables de clase", es decir, que todas las instancias de esa clase 
leen el mismo valor, en vez de que cada uno tenga su propia copia */

/* final: palabra reservada para crear "variables constantes", es decir, que solo pueden apuntar a un objeto. 
Sin embargo, el objeto apuntado si puede cambiar de valor */