import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        String word= input.next();

        String newWord=isPalindrome(word);

        if(newWord.equals(word)){
            System.out.println(word+ " palindromik bir kelimedir.");
        }
        else {
            System.out.println(word+ " palindromik bir kelime değildir.");
        }

    }
    static String isPalindrome(String str){
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){//Aynı kelimeyi tersten oluşturur
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}