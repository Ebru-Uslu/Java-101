import java.util.Scanner;

public class Main {

    static boolean isPrime(int num,int counter){
        if(counter<2){//Bitirme koşulu,eğer 1e kadar bölünebilen bir sayı bulunmadıysa asaldır
            return true;
        }
        if(num%counter==0) {//Sayı bölünüyorsa asal değildir
            return false;
        }
        return isPrime(num,counter-1);//Recursive yapı
    }

    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        boolean result=isPrime(number,number-1);

        if (result){
            System.out.println(number+" sayısı asaldır.");
        }
        else {
            System.out.println(number+" sayısı asal değildir.");
        }
    }
}