import java.util.concurrent.Semaphore;

public class App {
	public static void main (String[] args) throws Exception {
		
		Semaphore x = new Semaphore(2);
		Semaphore y = new Semaphore(0);
		Semaphore z = new Semaphore(0);
		Semaphore c1 = new Semaphore(1);
		
		
		Thread1 a = new Thread1(x,y,z,c1);
		Thread2 b = new Thread2(x,y,z,c1);
		Thread3 c = new Thread3(x,y,z,c1);
		
		a.start();
		b.start();
		c.start();
		
		a.join();
		b.join();	
		c.join();
	}
}
