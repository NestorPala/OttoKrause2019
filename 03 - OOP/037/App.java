public class App {
	public static void main (String[] args) {
		Point a = new Point(3,4);
		Point b = new Point(5,2);
		Point c = a.add(b);
		System.out.println(c);
	}
}