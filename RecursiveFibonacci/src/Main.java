import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinde kaçıncı adımdaki sayıyı bulmak istiyorsunuz: ");
        number=input.nextInt();

        System.out.println(number+". adımdaki sayı: "+recursiveFibonacci(number));//Kullanıcıdan alınan sayı fonksiyona gönderilir
    }

    static int recursiveFibonacci(int num){
        if(num==1 ||num==2){//Fibonacci serisinde 1 ve 2.sayıların değeri 1dir
            return 1;
        }
        return recursiveFibonacci(num-1)+recursiveFibonacci(num-2);
        //Fibonacci serisinde bir adımın değeri,önceki iki adımın toplamına eşittir
    }
}