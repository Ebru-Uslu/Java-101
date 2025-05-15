import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physics,chemistry,history,turkish,music;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        math=input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        physics=input.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        chemistry=input.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        history=input.nextInt();

        System.out.print("Türkçe notunuzu girin: ");
        turkish=input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        music=input.nextInt();

        double average= (math+physics+chemistry+history+turkish+music)/6;
        System.out.println("Ortalamanız: "+average);

        String result = (average<60) ? ("Sınıfta kaldı") : "Sınıfı geçtin ";
        System.out.println(result);
    }
}