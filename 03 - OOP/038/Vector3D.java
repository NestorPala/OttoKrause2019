package ar.edu.ottokrause.psr.math;

public class Vector3D {
	
	private double x;
	private double y;
	private double z;
	
	public Vector3D () {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector3D (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX () {	
		return this.x;
	}
	
	public double getY () {	
		return this.y;
	}
	
	public double getZ () {
		return this.z;
	}
	
	public double norm () {
		return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
	
	public Vector3D add (Vector3D a) {
		Vector3D total = new Vector3D (this.getX() + a.getX(), this.getY() + a.getY(), this.getZ() + a.getZ());
		return total; 
	}
	
	public Vector3D dotProduct (Vector3D a) {
		Vector3D total = new Vector3D (this.getX() * a.getX(), this.getY() * a.getY(), this.getZ() * a.getZ());
		return total; 
	}
}

//https://www.ditutor.com/vectores/vector_3d.html
