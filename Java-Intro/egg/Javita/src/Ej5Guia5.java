
public class Ej5Guia5 {
    public static void main(String[] args) {
        int[][] matriz={{0,-2,4}, {2,1,2}, {-4,-2,0}};
        int[][] matriztr = new int[3][3];

        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                matriztr[i][j] = matriz[j][i];
            }
        }
        mostrarmat(matriztr,matriz);
        int cont=0;
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[i][j] + matriztr[i][j])!=0){
                    cont++;
                }
            }
        }
        if (cont==0){
            System.out.println("La matriz es antisimetrica");
        }else {
            System.out.println("la matriz no es antisimetrica");
        }
    }

    private static void mostrarmat(int[][] matriztr,int[][] matriz) {
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("[ "+matriz[i][j] +" ]");
            }
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("[ "+matriztr[i][j] +" ]");
            }
            System.out.println("");
        }
    }
}
