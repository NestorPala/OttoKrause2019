import java.util.concurrent.Semaphore;

public class App {
	public static void main (String[] args) throws Exception {
		
		Semaphore x = new Semaphore(2);
		Semaphore y = new Semaphore(0);
		
		ThreadA a = new ThreadA(x,y);
		ThreadB b = new ThreadB(x,y);
		
		a.start();
		b.start();
		
		a.join();
		b.join();	
	}
}
