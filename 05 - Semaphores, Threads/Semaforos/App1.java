import java.util.concurrent.Semaphore;

public class App1 {
	public static void main (String[] args) throws Exception {
		Semaphore x = new Semaphore(1);
		
		ThreadA ta = new ThreadA(x);
		ThreadB tb = new ThreadB(x);
		
		ta.start();
		tb.start();
		
		ta.join();
		tb.join();
		
	}
}
