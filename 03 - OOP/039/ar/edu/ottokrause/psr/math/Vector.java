package ar.edu.ottokrause.psr.math;

public class Vector {
	private double[] vector;
	
	public Vector (int coordinateCount) {
		vector = new double[coordinateCount];
	}
	
	public Vector (double[] coordinates) {
		for (int i=0; i<coordinates.length; i++) {
			this.vector[i] = coordinates[i];
		}
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
			
		}
	}
	
	public Vector add (Vector a) {
	}
	
	public double dotProduct (Vector a) {
	}
}
