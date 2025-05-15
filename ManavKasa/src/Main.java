import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear,apple,tomato,banana,eggplant,total;
        Scanner input= new Scanner(System.in);

        System.out.print("Armut kaç kilo? :");
        pear=input.nextDouble();

        System.out.print("Elma kaç kilo? :");
        apple=input.nextDouble();

        System.out.print("Domates kaç kilo? :");
        tomato=input.nextDouble();

        System.out.print("Muz kaç kilo? :");
        banana=input.nextDouble();

        System.out.print("Patlıcan kaç kilo? :");
        eggplant=input.nextDouble();

        total= pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95+ eggplant*5;
        System.out.printf("Toplam tutar: %.3f TL",total);
    }
}