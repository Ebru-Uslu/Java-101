import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cost;
        Scanner input =  new Scanner(System.in);
        System.out.print("Kaç km gidilecek: ");
        double km= input.nextDouble();
        cost =10+km*2.2;
        if(cost<20) {
            cost=20;
        }
        System.out.println("Taksimetre tutarı "+ cost);
    }
}