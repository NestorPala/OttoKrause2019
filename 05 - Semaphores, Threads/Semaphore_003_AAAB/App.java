import java.util.concurrent.Semaphore;

public class App {
	public static void main (String[] args) throws Exception {
		
		Semaphore x = new Semaphore(3);
		Semaphore y = new Semaphore(0);
		Semaphore a1 = new Semaphore(1);
		Semaphore b1 = new Semaphore(0);
		
		
		Thread1 a = new Thread1(x,y,a1,b1);
		Thread2 b = new Thread2(x,y,a1,b1);
		
		a.start();
		b.start();
		
		a.join();
		b.join();	
	}
}