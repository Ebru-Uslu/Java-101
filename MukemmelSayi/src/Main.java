import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        for(int i=1;i<number;i++){//Döngü 1'den sayının kendisine kadar olan sayıları kontrol eder
            if(number%i==0){//Eğer i değeri sayıya tam bölünüyorsa
                total+=i;//Toplam değere eklenir
            }
        }
        if(total==number){//Pozitif tam bölenlerin toplamı girilen sayıya eşit ise mükemmel sayıdır
            System.out.println(number+ " mükemmel sayıdır.");
        }
        else {
            System.out.println(number+ " mükemmel sayı değildir.");
        }
    }
}