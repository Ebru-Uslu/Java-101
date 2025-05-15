import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number; //kullanıcıdan alınacak sayı
        double total=0,divided=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        for(int i=0 ; i<number;i++){
            if(i%3==0 && i%4==0){
                total+=i;//sayı hem 3 hem 4e tam bölünüyorsa totale ekliyoruz
                divided++;//bölünebilen kaç sayı olduğunu bulmak için divided sayacı tutuyoruz
            }
        }
       System.out.print(number+ " sayısına kadar 3 ve 4'e tam bölünen sayıların ortalaması: "+(total/divided));
    }
}