import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=0,c=0,u;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını girin: ");
        System.out.print("a: ");
        a= input.nextInt();

        System.out.print("b: ");
        b= input.nextInt();

        System.out.print("c: ");
        c= input.nextInt();

        u=(a+b+c)/2;

        double area= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+area);
    }
}