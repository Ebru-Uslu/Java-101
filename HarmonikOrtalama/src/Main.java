import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;//dizinin uzunluğu
        double total=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        length= input.nextInt();
        double[] array= new double[length];

        System.out.print("Dizinin elemanlarını girin: ");
        for(int i=0;i<array.length;i++){//Kullanıcıdan alınan sayıları diziye atar
            int number= input.nextInt();
            array[i]=number;
        }

        for(int i=0;i<array.length;i++){//Harmonik seri oluşturur
            total+= 1/array[i];
        }
        System.out.println("Harmonik ortalama:"+(length/total));
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    }
}