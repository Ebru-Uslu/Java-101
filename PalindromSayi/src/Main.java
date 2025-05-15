import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        isPalindrome(number);//Kullanıcıdan alınan sayıyı fonksiyona gönderir

    }

    static void isPalindrome(int num){
        int reverseNumber=0,temp=num,lastNumber=0;

      while (temp>0){//asıl sayının değişmemesi için tempe'e asıl sayı atanır
          lastNumber= temp%10;//sayının 10a bölümünden kalanı verir.Yani son basamaktaki sayıyı
          reverseNumber=(reverseNumber*10)+lastNumber;//Yeni sayıya ekler
          temp/=10;//sayıyı 10e böler
      }
      if(num==reverseNumber){//yeni sayı ve tersten oluşturulan sayı eşit ise
          System.out.print(num+ " bir Palindrom sayıdır. ");
      }
      else {
          System.out.print(num+ " bir Palindrom sayı değildir. ");
      }
    }
}