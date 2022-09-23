public class Ejercicio36 {
    
    public static boolean error = false;
	
	//DEVUELVE EL RESULTADO DE LA INVERSA DE UNA MATRIZ (TAMBIEN COMPRUEBA SI SE PUEDE CALCULAR)
    public static double[][] MatrizInversa (double[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada");
            error = true;
            return matriz;
        }
        if (DeterminanteMatriz(matriz)==0) {
    			System.out.println("La matriz no tiene inversa");
    			error = true;
    			return matriz;
    		}
        else {
            return DivisionMatrizXEscalar(MatrizTraspuesta(MatrizAdjunta(matriz)), DeterminanteMatriz(matriz));
        }
    }
    
    //REALIZA EL COCIENTE ENTRE EL NUMERADOR "TRASPUESTA(ADJUNTA(MATRIZ))" Y EL DENOMINADOR "DETERMINANTE(MATRIZ)"
    public static double[][] DivisionMatrizXEscalar (double[][] matriz, double escalar) {
        double[][] matrizNueva = new double[matriz.length][matriz.length];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matrizNueva[i][j] = matriz[i][j] / escalar;
            }
        }
        return matrizNueva;
    }
    
    //CALCULA LA ADJUNTA DE UNA MATRIZ (INDEPENDIENTE DE LA TRANSPUESTA)
    public static double[][] MatrizAdjunta (double[][] matriz) {
        double[][] matrizNueva = new double[matriz.length][matriz.length]; 
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matrizNueva[i][j] = Math.pow((-1),(i+j)) * DeterminanteMatriz(MatrizExclusiva(matriz, i, j));
            }
        }
        return matrizNueva;
    }
 
    
    //DADA UNA POSICION A(I, J) SACA EL DETERMINANTE DE LA MATRIZ
    //RESULTANTE DE ELIMINAR LA FILA "I" Y LA COLUMNA "J" DE ESA POSICION
    public static double[][] MatrizExclusiva(double[][] matriz, int i, int j) {
        int n=-1, n2=-1;
        double[] aux = new double[(matriz.length-1)*(matriz.length-1)];
        double[][] matrizNueva = new double[matriz.length-1][matriz.length-1];
        
        for (int x=0; x<matriz.length; x++) {
            for (int y=0; y<matriz[x].length; y++) {
                if  (x != i && y != j) {
                    n++;
                    aux[n]=matriz[x][y];
                }
            }
        }
        
        for (int x=0; x<matrizNueva.length; x++) {
            for (int y=0; y<matrizNueva[x].length; y++) {
                n2++;
                matrizNueva[x][y] = aux[n2];                                               
            }
        }
        return matrizNueva;
    }
    
    //CALCULA LA TRASPUESTA DE UNA MATRIZ
    public static double[][] MatrizTraspuesta (double[][] matriz) {
        double tras[][] = new double[matriz[0].length][matriz.length];
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                tras[i][j] = matriz[j][i];
            }
        }
        return tras;
    }
  
    //CALCULA EL VALOR DETERMINANTE DE UNA MATRIZ (METODO GENERAL QUE REDIRECCIONA A M�TODO SIMPLE O LAPLACE)
    public static double DeterminanteMatriz (double[][] matriz) {
        double total = 0;
       
        if (matriz.length > 3) {
            total = DeterminanteMatrizLaplace(matriz);
        }
        else {
            total = DeterminanteMatriz123(matriz);
        }
        
        return total;
    }
    
   //CALCULA EL DETERMINANTE DE UNA MATRIZ DE: 1x1, 2x2, 3x3 (REGLA DE CRAMER)
    public static double DeterminanteMatriz123 (double[][] matriz) {
      double total = 0;
        if (matriz.length == 1) {
            total = matriz[0][0];
        }
        
        if (matriz.length == 2) {
            total = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
        
        if (matriz.length == 3) {
            total =
            	matriz[0][0] * matriz[1][1] * matriz[2][2]
            + matriz[0][1] * matriz[1][2] * matriz[2][0]
            + matriz[0][2] * matriz[1][0] * matriz[2][1]
            - matriz[0][2] * matriz[1][1] * matriz[2][0]
            - matriz[0][0] * matriz[1][2] * matriz[2][1]
            - matriz[0][1] * matriz[1][0] * matriz[2][2];
        }
        
        return total;
    }
    
    //CALCULA EL DETERMINANTE DE UNA MATRIZ DE (>3) x (>3) USANDO EL TEOREMA DE LAPLACE
    public static double DeterminanteMatrizLaplace(double[][] matriz) {
        double total = 0;
        for (int i=0; i<matriz.length; i++) {
            total += matriz[0][i] * Math.pow((-1),(0+i)) * DeterminanteMatriz(MatrizExclusiva(matriz, 0, i));
        }
        return total;
    }
    
    //IMPRIME LA MATRIZ (NO IMPRIME SI HUBO UN ERROR)
    public static void ImprimirMatriz (double[][] matriz) {
        if (error) {
            return;
        }
        else {
        	for (int i=0; i<matriz.length; i++) {
            	for (int j=0; j<matriz[i].length; j++) {
                System.out.printf("%.2f   ", matriz[i][j]);
            	}
            	System.out.println("");
             System.out.println("");
        	}
        	return;
        }
   	 }
    
//--------------------------------------------------------------- 
    
    public static void main (String[] args) {
    	double[][] a = {{8,9,7,6,5},{2,1,3,7,1},{1,1,1,1,1},{6,5,3,8,6},{0,-2,-6,2,1}}; //Predeterminado
        double[][] b = {{1,2},{-2,3}};
        double[][] c = {{1,1,0,0},{0,-1,-2,0},{0,0,1,-1},{0,0,0,1}};
        double[][] d = {{3,0,0,0,0},{0,3,0,0,0},{0,0,3,0,0},{0,0,0,3,0},{0,0,0,0,3}};
        double[][] e = {{4,0,0,0,1},{0,4,0,0,0},{0,0,4,0,0},{0,0,0,4,0},{1,0,0,0,4}};
        double[][] f = {{0,3,3},{5,0,3},{-3,2,0}};
        double[][] g = {{1,2,3,4},{0,0,0,0},{-1,-1,-1,-1},{2,2,2,2}}; //Prueba el error
        
        ImprimirMatriz(MatrizInversa(a));
    }
}
//Probar programa: https://m.matrix.reshish.com/es/inverCalculation.php