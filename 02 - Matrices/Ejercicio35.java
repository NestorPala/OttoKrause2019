
public class Ejercicio35 {
    public static double[][] TrasponerMatriz (double[][] matriz) {
        double tras[][] = new double[matriz[0].length][matriz.length];
        
        for (int j=0; j<matriz.length; j++) {
            for (int i=0; i<tras.length; i++) {
                tras[i][j] = matriz[j][i];
            }
        }
        return tras;
    }
    
    public static void main (String[] args) {
        double[][] a = {{2,18,17},{14,5,21},{16,5,18},{19,12,14},{5,15,20}};
        double[][] b = TrasponerMatriz(a);
        
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
  		  }
    }
}
