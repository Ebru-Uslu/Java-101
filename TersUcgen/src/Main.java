import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);

        System.out.print("Üçgenin basamak sayısını girin: ");
        number= input.nextInt();

        for(int i=number;i>0;i--){
            for(int j=1;j<=number-i;j++){
                System.out.print(" ");// Boşlukları yazdırır
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");// Yıldızları yazdırır
            }
            System.out.println("");// Bir sonraki satıra geçer
        }
    }
}