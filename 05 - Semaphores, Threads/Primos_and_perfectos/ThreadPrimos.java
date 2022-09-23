
public class ThreadPrimos extends Thread {
	private int[] a;
	private int contador=0, i, j;
	
	
	public ThreadPrimos (int[] a) {
		this.a = a;
	}
	
	
	@Override
	public void run () {
		for (i=0; i<this.a.length; i++) {
			
			for (j=1; j<=a[i]; j++) {
				if ((a[i] % j) == 0) {
					contador++;
				}
			}
			
			if (contador <= 2) {
				System.out.println("isPrime(" + a[i] + ") = true");
			}
			else {
				System.out.println("isPrime(" + a[i] + ") = false");
			}
			
		}
	}
}