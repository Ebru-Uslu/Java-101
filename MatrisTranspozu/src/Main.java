import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matrix= { {1,2,3}, {4,5,6},{7,8,9},{10,11,12}};

        System.out.println("Matris : ");//Mevcut matrisi yazdırır
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpoz: ");
        for(int i=0;i<matrix[i].length;i++){//Transpoz matriste array boyutları tam tersi
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}