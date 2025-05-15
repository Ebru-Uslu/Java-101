import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);

        int right = 0;
        boolean isWin=false;

        while (right <5) {
            System.out.print("Lütfen tahmininizi girin: ");
            int choice = input.nextInt();

            if (choice < 0 || choice > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!!");
                continue;  // Yeniden tahmin almak için döngünün başına döner
            }
            if (number == choice) {
                System.out.println("Tebrikler.Sayıyı doğru tahmin ettiniz!Doğru sayı: " + number);
                isWin=true;
                break;
            }
            else {
                right++;
                System.out.println("Hatalı tahmin!" + (5-right) + " tahmin hakkınız kaldı.");
                if (number > choice) {
                    System.out.println("->Tahmininiz gerçek sayıdan küçük.");
                } else if (number < choice) {
                    {
                        System.out.println("->Tahmininiz gerçek sayıdan büyük.");
                    }
                }
            }
        }
        if(!isWin){
            System.out.println("Oyunu kaybettiniz.Doğru sayı: "+number);
        }

    }
}