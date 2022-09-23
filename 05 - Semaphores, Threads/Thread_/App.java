
public class App {
	public static void main (String[] args) throws Exception {
		
		//CREA LOS OBJETOS
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		//PREPARA LOS OBJETOS PARA EJECUTARSE EN UN THREAD APARTE
		ta.start();
		tb.start();
		
		//BLOQUEA LA EJECUCION DE "MAIN" HASTA QUE TERMINEN LOS THREADS
		ta.join();
		tb.join();
		
		
		//-------------------------------------------
		
		
		ThreadFactorial tf = new ThreadFactorial(100);
		tf.start();
		tf.join();
		
		int[] r = tf.getResult();
		
		for (int i=0; i<r.length; i++) {
			System.out.println(r[i]);
		}
	}
}
