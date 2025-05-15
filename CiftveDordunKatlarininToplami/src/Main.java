import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total=0;
        Scanner input= new Scanner(System.in);

        do {
            System.out.print("Bir sayi girin: ");
            number= input.nextInt();

            if(number%4==0) {//sayı 4e bölünebiliyorsa totale ekliyoruz
                total+=number;
            }
        }
        while (number %2!=1);
        System.out.print(number+" sayısına kadar çift ve 4ün katları olan sayıların toplamı: "+total);
    }
}