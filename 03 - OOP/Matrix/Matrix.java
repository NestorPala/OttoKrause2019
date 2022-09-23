//Ejercicio 12
public class Matrix {
	private double[][] data;
	
	public int rows () {
		return this.data.length;
	}
	
	public int columns () {
		return this.data[0].length;
	}
	
	public double get (int row, int column) {
		return this.data[row][column];
	}
	
	public void set (int row, int column, double value) {
		this.data[row][column] = value;
	}
	
	/////////////////////////////////

	public Matrix (int rows, int columns) {
		this.data = new double[rows][columns];
	}
	
	public Matrix (double[][] elements) {
		this.data = new double[elements.length][elements[0].length];
		
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
				this.set(i, j, elements[i][j]);
			}
		}
	}
	
	public Matrix (Matrix a) {
		this.data = new double[a.rows()][a.columns()];
		
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
				this.set(i, j, a.get(i, j));
			}
		}
	}
	
	//Ejercicio 13
	public boolean isDiagonal () {
		
		int aux, zerocont=0, numcont=0;
		aux = (this.rows() * this.columns()) - this.rows();
		
		if (this.rows() == this.columns()) {
			for (int i=0; i<this.rows(); i++) {
				for (int j=0; j<this.columns(); j++) {
					if (i == j) {
						if (this.get(i, j) != 0) {
							numcont++;
						}
					}
					else {
						if (this.get(i, j) == 0) {
							zerocont++;
						}
					}
				}
			}
		}
		else return false;
		
		if (zerocont == aux && numcont == this.rows()) {
			return true;
		}
		else return false;
	}
	
	
	//Ejercicio 14
	public boolean isIdentity () {
		
		int aux, zerocont=0, numcont=0;
		aux = (this.rows() * this.columns()) - this.rows();
		
		if (this.rows() == this.columns()) {
			for (int i=0; i<this.rows(); i++) {
				for (int j=0; j<this.columns(); j++) {
					if (i == j) {
						if (this.get(i, j) == 1) {
							numcont++;
						}
					}
					else {
						if (this.get(i, j) == 0) {
							zerocont++;
						}
					}
				}
			}
		}
		else return false;
		
		if (zerocont == aux && numcont == this.rows()) {
			return true;
		}
		else return false;
	}
	
	
	//Ejercicio 15
	public void scalar (double value) {
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
				this.set(i, j, this.get(i, j)*value);
			}
		}
	}
	
	
	//Ejercicio 16
	public Matrix add (Matrix a) {
		Matrix total = new Matrix(a.rows(), a.columns());
		
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
				total.set(i, j, this.get(i, j) + a.get(i, j));
			}
		}
		return total;
	}
	
	
	//Ejercicio 17
	public Matrix substract (Matrix a) {
		Matrix total = new Matrix(a.rows(), a.columns());
		
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
				total.set(i, j, this.get(i, j) - a.get(i, j));
			}
		}
		return total;
	}
	
	
	//Ejercicio 18
	public Matrix multiplyBy (Matrix a) {
		
		Matrix total = new Matrix(a.rows(), a.columns());
		
		if (this.columns() != a.rows()) {
			if ((this.rows() == 2) && (a.columns() == 2)) {
				total.set(0, 0, this.get(0, 0)*a.get(0, 0));
				total.set(0, 1, this.get(0, 0)*a.get(0, 1));
				total.set(1, 0, this.get(0, 1)*a.get(0, 0));
				total.set(1, 1, this.get(0, 1)*a.get(0, 1));
			}
			else {
				System.out.println("Las matrices no son multiplicables entre si");
			}
		}
		else {
			for (int i=0; i<this.rows(); i++) {
				for (int j=0; j<a.columns(); j++) {
					for (int k=0; k<a.rows(); k++) {
						total.set(i, j, total.get(i, j) + (this.get(i, k)*a.get(k, j)) );
					}
				}
			}
		}
		
		return total;
	}
	
	
	//Ejercicio 19
	public Matrix transpose () {
        Matrix tras = new Matrix(this.columns(), this.rows());
        
        for (int j=0; j<this.rows(); j++) {
            for (int i=0; i<tras.rows(); i++) {
            	tras.set(i,  j,  this.get(j, i));
            }
        }
        return tras;
    }
	
	
	//Ejercicio 20
	public boolean isSymmetrical () {
		Matrix aux = this.transpose();
		int aux2=0;
		
		for (int i=0; i<this.rows(); i++) {
			for (int j=0; j<this.columns(); j++) {
            	if (this.get(i, j)==aux.get(i, j)) {
            		aux2++;
            	}
            }
        }
		
		if (aux2 == (this.rows() * this.rows())) {
			return true;
		}
		else return false;
	}
	
	
	//Ejercicio 21
	/*Rotar la matriz a la izquierda*/
	
	//Ejercicio 22
	/*Rotar la matriz a la derecha*/
	
	////////////////////////////////////////////////////////77777
	
	public static void main (String[] args) {
		
		Matrix a = new Matrix(2, 2);
		a.set(0, 0, 1);
		a.set(0, 1, 2);
		a.set(1, 0, 3);
		a.set(1, 1, 4);
		System.out.println(a.get(0, 0));
		System.out.println(a.get(0, 1));
		System.out.println(a.get(1, 0));
		System.out.println(a.get(1, 1));
		
		System.out.println("");
		
		Matrix b = new Matrix(a);
		System.out.println(b.get(0, 0));
		System.out.println(b.get(0, 1));
		System.out.println(b.get(1, 0));
		System.out.println(b.get(1, 1));
		
		System.out.println("");
		
		double[][] zzz = {{1,2},{3,4}};
		Matrix c = new Matrix(zzz);
		System.out.println(c.get(0, 0));
		System.out.println(c.get(0, 1));
		System.out.println(c.get(1, 0));
		System.out.println(c.get(1, 1));
		
		System.out.println("");
		
		Matrix d = new Matrix(3,3);
		d.set(0, 0, 1);
		d.set(0, 1, 0);
		d.set(0, 2, 0);
		d.set(1, 0, 0);
		d.set(1, 1, 1);
		d.set(1, 2, 0);
		d.set(2, 0, 0);
		d.set(2, 1, 0);
		d.set(2, 2, 2);
		System.out.println(d.isDiagonal());
		System.out.println(d.isIdentity());
		
		System.out.println("");
		
		Matrix e = new Matrix(2,2);
		double num = 5;
		e.set(0, 0, 1);
		e.set(0, 1, 2);
		e.set(1, 0, 3);
		e.set(1, 1, 4);
		e.scalar(5);
		System.out.println(e.get(0, 0));
		System.out.println(e.get(0, 1));
		System.out.println(e.get(1, 0));
		System.out.println(e.get(1, 1));
		
		System.out.println("");
		
		Matrix f = new Matrix(2,2);
		f.set(0, 0, 8);
		f.set(0, 1, 8);
		f.set(1, 0, 8);
		f.set(1, 1, 8);
		Matrix g = f.add(e);
		System.out.println(g.get(0, 0));
		System.out.println(g.get(0, 1));
		System.out.println(g.get(1, 0));
		System.out.println(g.get(1, 1));
		
		System.out.println("");
		
		Matrix h = f.substract(a);
		System.out.println(h.get(0, 0));
		System.out.println(h.get(0, 1));
		System.out.println(h.get(1, 0));
		System.out.println(h.get(1, 1));
		
		System.out.println("");
		
		Matrix k = h.multiplyBy(a);
		
		for (int i=0; i<k.rows(); i++) {
			for (int j=0; j<k.columns(); j++) {
				System.out.print(k.get(i,j) + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		Matrix l = k.transpose();
		
		for (int i=0; i<k.rows(); i++) {
			for (int j=0; j<k.columns(); j++) {
				System.out.print(l.get(i,j) + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		Matrix m = new Matrix(3,3);
		m.set(0, 0, 2);
		m.set(0, 1, -1);
		m.set(0, 2, 0);
		m.set(1, 0, -1);
		m.set(1, 1, 3);
		m.set(1, 2, 7);
		m.set(2, 0, 0);
		m.set(2, 1, 7);
		m.set(2, 2, -2);
		System.out.println(m.isSymmetrical());
		
		System.out.println("");
	}
}