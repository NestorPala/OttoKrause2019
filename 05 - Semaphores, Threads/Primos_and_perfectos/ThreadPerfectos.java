
public class ThreadPerfectos extends Thread {
	private int[] a;
	private int sumaDiv=0, i, j;

	
	public ThreadPerfectos (int[] a) {
		this.a = a;
	}
	
	
	@Override
	public void run () {
		for (i=0; i<a.length; i++) {
			
			for (j=1; j<a[i]; j++) {
				if ((a[i] % j) == 0) {
					sumaDiv += j;
				}
			}
			
			if (sumaDiv == a[i]) {
				System.out.println("isPerfect(" + a[i] + ") = true");
			}
			else {
				System.out.println("isPerfect(" + a[i] + ") = false");
			}
			
		}
	}
}
