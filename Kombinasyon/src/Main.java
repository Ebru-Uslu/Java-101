import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,comNumber;//kullanıcıdan alınan sayılar
        int numberProduct=1,comNumberProduct=1;//çarpımlar için kullanılacak değişkenler
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        System.out.print("Kombinasyonu oluşturulacak değeri girin: ");
        comNumber= input.nextInt();

        //İlk girilen sayı,kombinasyonu oluşturulacak değer kadar azalarak çarpılır.
        for(int i=number;i>number-comNumber;i--){
            numberProduct*=i;
        }

        System.out.println("");

        //İkinci girilen kombinasyonu oluşturulacak değer,faktöriyel şeklinde çarpılır
        for(int j=comNumber;j>0;j--){
            comNumberProduct*=j;
        }

        //ilk çarpımı ikinci çarpıma bölünce kombinasyon elde edilir
        System.out.print(number+"'in "+comNumber+"'li kombinasyonu: "+(numberProduct/comNumberProduct));
    }
}