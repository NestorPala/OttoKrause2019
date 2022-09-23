
public class NumFinder extends Thread {
	
	//VARIABLE PARA DETECTAR NUMERO ENCONTRADO PARA TODOS LOS THREADS
	private static boolean found = false;
	
	//GUARDA EL ESTADO DE CADA THREAD PARA EVALUAR LUEGO
	public static boolean isFound() {
		return found;
	}
	
	//REINICIA EL BUSCADOR
	public static void resetFound() {
		found = false;
	}
	
	private int startPosition;
	
	private int[] array;
	private int threadCount;
	private int threadNumber;
	private int numToFind;
	
	public NumFinder (String name, int[] array, int threadCount, int threadNumber, int numToFind) {
		super(name); //ASIGNA UN NOMBRE AL THREAD
		
		this.array = array;
		this.threadCount = threadCount;
		this.threadNumber = threadNumber;
		this.numToFind = numToFind;
	}
	
	
	public void run () {
		if (found) {
			return;
		}
		
		int amountToAnalyze = this.array.length / threadCount;
		
		
		if (threadNumber == 0) startPosition = 0;
		else {
			startPosition = threadNumber * amountToAnalyze;
		}
		
		
		int endPosition = startPosition + amountToAnalyze;
		
		
		for (int i=startPosition; !found && i<endPosition; i++) {
			if (this.array[i] == this.numToFind) {
				found = true;
				System.out.println(this.getName());
			}
		}
	}
}
