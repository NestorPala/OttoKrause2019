
public class Rectangle {
	private double base;
	private double altura;
	private Point origen;
	
	public Rectangle(double base, double altura, Point origen) {
		this.base = base;
		this.altura = altura;
		this.origen = origen;
	}
	
	public double getArea() {
		return this.base * this.altura;
	}
	
	public Point getOrigin(){
		return origen;
	}
	
	public Point getCorner(){
		Point corner = new Point(origen.getX()+base, origen.getY()-altura);
		return corner;
	}
	
	public double getPerimeter(){
		return base*2+altura*2;
	}
}
