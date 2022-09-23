import java.util.concurrent.Semaphore;

public class App {
	public static void main (String[] args) throws Exception {
		
		Semaphore w = new Semaphore(2);
		Semaphore x = new Semaphore(0);
		Semaphore e1 = new Semaphore(0);
		Semaphore e2 = new Semaphore(1);
		Semaphore e3 = new Semaphore(0);
		
		
		Thread1 a = new Thread1(w,x,e1,e2,e3);
		Thread2 b = new Thread2(w,x,e1,e2,e3);
		Thread3 c = new Thread3(w,x,e1,e2,e3);
		Thread4 d = new Thread4(w,x,e1,e2,e3);
		
		a.start();
		b.start();
		c.start();
		d.start();
		
		a.join();
		b.join();	
		c.join();
		d.join();
	}
}