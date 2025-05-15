import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double entry, total,kdv;
        System.out.print("Para değerini girin: ");
        entry = input.nextDouble();
        System.out.println("KDV'siz fiyat: "+entry);
        if (0<entry && entry<1000){
            kdv= (entry*18)/100;
            total= kdv+entry;
            System.out.println("KDV'li fiyat: "+total);
            System.out.println("KDV tutarı: "+kdv);
        }
        else if (entry>1000) {
            kdv= (entry*8)/100;
            total= kdv+entry;
            System.out.println("KDV'li fiyat: "+total);
            System.out.println("KDV tutarı: "+kdv);

        }

    }
}