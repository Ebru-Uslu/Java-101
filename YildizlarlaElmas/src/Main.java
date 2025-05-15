import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        //Artan yıldız satırları için
        for(int i=1;i<=number;i++){
            for(int j=1;j<=(number-i);j++){//boşluk miktarını ayarlar
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){//yıldız sayısını ayarlar
                System.out.print("*");
            }
            System.out.println("");
        }

        //Azalan yıldız satırları için
        for(int i=number-1;i>=1;i--){//en uzun satır ortak kullanıldığı için,azalan sıra 1 satır eksik basılır
            for(int j=1;j<=(number-i);j++){//boşluk miktarını ayarlar
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){//yıldız sayısını ayarlar
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}