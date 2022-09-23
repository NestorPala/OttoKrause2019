import java.util.concurrent.Semaphore;

public class Application {
	public static void main (String[] args) {
		
		int cantidad = 100;
		int[] buffer = new int[cantidad];
		Indexer indexer = new Indexer();
		
		Semaphore a = new Semaphore(1);
		
		Par pares = new Par(buffer, indexer, a);
		Impar impares = new Impar(buffer, indexer, a);
		
		
		pares.start();
		impares.start();
		
		
		try {
			pares.join();
			impares.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
