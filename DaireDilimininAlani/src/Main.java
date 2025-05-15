import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double alfa,area;
       final double pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Merkez açının ölçüsünü giriniz: ");
        alfa= input.nextDouble();

        System.out.print("Yarıçapı giriniz: ");
        r= input.nextInt();

        area= (pi *(r*r)*alfa)/360;
        System.out.println("Daire diliminin alanı: "+area);
    }
}