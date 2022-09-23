import java.util.Random;

public class Application {
	public static void main (String[] args) {
		
		int tam = 100, threads = 5, numToFind = 86;
		
		int[] array = new int[tam];
		NumFinder[] finders = new NumFinder[threads];
		fillArray(array);
		
		
		for (int i=0; i<threads; i++) {
			finders[i] = new NumFinder("Thread "+i, array, threads, i, numToFind);
		}
		
		NumFinder.resetFound();

		for (int i=0; i<threads; i++) {
			finders[i].start();
		}
		
		for (int i=0; i<threads; i++) {
			try {
				finders[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		if (NumFinder.isFound()) {
			System.out.println("Se encontro el numero");
		}
		else {
			System.out.println("No se encontro el numero");
		}
		
			
	}
	
	
	public static void fillArray (int[] array) {
		
		Random random = new Random();
		
		for (int i=0; i<array.length; i++) {
			array[i] = random.nextInt(100);
		}
		
		return;
	}
}