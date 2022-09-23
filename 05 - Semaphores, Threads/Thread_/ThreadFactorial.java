public class ThreadFactorial extends Thread {
	private int n;
	private int[] result;
	
	public ThreadFactorial (int n) {
		this.n = n;
		this.result = new int[n];
	}
	
	@Override
	public void run () {
		int f=1;
		for (int i=1; i<=this.result.length; i++) {
			this.result[i-1] = f;
			f *= i;
		}
	}
	
	public int[] getResult () {
		return this.result;
	}
}