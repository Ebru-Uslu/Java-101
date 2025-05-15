import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double total=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        //i'yi int yapınca,int bölmesinden dolayı 1/i sayısını 0 döndürüyor
        for(double i=1;i<=number;i++){
            total+= 1/i;
        }
        System.out.println("Harmonik seri toplamı:"+total);
    }
}