public class Point {
	private double x;
	private double y;
	
	public Point (double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double norm() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public Point add (Point b) {
		double SumX = this.getX() + b.getX();
		double SumY = this.getY() + b.getY();
		
		Point result = new Point(SumX, SumY);
		
		return result;
	}
	
	
	@Override
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
}