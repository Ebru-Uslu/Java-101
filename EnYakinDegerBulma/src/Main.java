import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;//dizinin uzunluğu
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        length= input.nextInt();
        int[] array= new int[length];

        System.out.print("Dizinin elemanlarını girin: ");
        for(int i=0;i<array.length;i++){//Kullanıcıdan alınan sayıları diziye atar
            int number= input.nextInt();
            array[i]=number;
        }

        int min= array[0];
        int max= array[0];

        System.out.print("Bir sayı girin: ");
        int number= input.nextInt();

        for (int i : array) {//dizinin maksimum ve minimum değerlerini bulur
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i]<number && array[i]>min){
                min=array[i];
                //i değeri aradığımız sayıdan küçük ve daha önceki minimum değerden büyük olmalıdır
            }
            if(array[i]>number && array[i]<max){
                max=array[i];
                //i değeri aradığımız sayıdan büyük ve daha önceki maksimum değerden küçük olmalıdır.
                //Ki sayıya yakın olsun
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+max);
    }
}