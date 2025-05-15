import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int length = input.nextInt();//Kullanıcıdan dizi uzunluğunu alır
        int[] array = new int[length];

        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 0; i < length; i++) {
            System.out.print((i+1)+". elemanı: ");
            array[i] = input.nextInt();
        }

        sort(array);

        System.out.print("Sıralama: ");//Sıralanmış arrayi yazdırır
        for(int i:array){
            System.out.print(i);
            System.out.print("\t");
        }
    }
    static int[] sort(int[] array){//dizi içindeki elemanları küçükten büyüğe sıralar
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                int temp=0;
                if(array[i]>array[j]){//i değeri j'den büyükse i ve j'nin yerlerini değiştirir
                    temp=array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}