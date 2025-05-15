import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,temp,total=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number=input.nextInt();

        temp=number;//Asıl sayı değişmesin diye temp tutulur

        while (temp!=0){
            total+= temp%10;//sayının modunu alıp toplama ekleriz
            temp/=10;//Sayının her adımda son basamağı atılır
        }
        System.out.println(number+" sayısının basamak sayılarının toplamı: "+total);
    }
}