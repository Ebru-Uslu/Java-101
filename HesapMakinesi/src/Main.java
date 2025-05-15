import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        String choice = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        num2 = input.nextInt();

        System.out.println("Yapmak istediginiz islemi secin: \n + - * /");
        choice= input.next();

        switch (choice) {
            case  "+":
                System.out.println("Sayıların toplamı: "+(num1+num2));
                break;
            case  "-":
                System.out.println("Sayıların farkı: "+(num1-num2));
                break;
            case  "*":
                System.out.println("Sayıların toplamı: "+(num1*num2));
                break;
            case  "/":
                if(num2==0){
                    System.out.println("Bir sayı 0a bölünemez!");
                }
                System.out.println("Sayıların bölümü: "+(num1/num2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                break;

        }
    }
}