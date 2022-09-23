public class Vector {
	private double[] vector;
	
	public Vector (int coordinateCount) {
		this.vector = new double[coordinateCount];
	}
	
	public Vector (double[] coordinates) {
		this.vector = new double[coordinates.length];
		for (int i=0; i<coordinates.length; i++) {
			this.vector[i] = coordinates[i];
		}
	}
	
	public int cantCoordinates () {
		return this.vector.length;
	}
	
	public void setCoordinate (int index, double num) {
		this.vector[index] = num;
	}
	
	//-----------------------------------------
	
	public double getCoordinate (int index) {
		double total=0;
		for (int i=0; i<this.vector.length; i++) {
			if (i==index) {
				total = this.vector[i];
			}
		}
		return total;
	}
	
	
	public double norm () {
		double total=0;
		for (int i=0; i<this.vector.length; i++) {
			total += this.vector[i] * this.vector[i];
		}
		total = Math.sqrt(total);
		return total;
	}
	
	
	public Vector add (Vector a) {
		Vector total = new Vector(a.cantCoordinates());
		
		for (int i=0; i<this.cantCoordinates(); i++) {
			total.setCoordinate(i, this.getCoordinate(i)+a.getCoordinate(i));
		}
		return total;
	}
	
	
	public double dotProduct (Vector a) {
		double total=0;
		for (int i=0; i<this.cantCoordinates(); i++) {
			total += this.getCoordinate(i) * a.getCoordinate(i);
		}
		return total;
	}
	
	///////////////////////////////////////////////
	
	public static void main(String[] args) {
		double[] coord = {2,3,2,5,1};
		
		Vector a = new Vector(coord);
		
		System.out.println(a.getCoordinate(2));
		System.out.println(a.norm());
		a.add(b);
		
	}
}