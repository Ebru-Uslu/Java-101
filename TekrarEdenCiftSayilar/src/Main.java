import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;//dizinin uzunluğu
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        length = input.nextInt();
        int[] array = new int[length];//Kullanıcıdan gelen sayıyı dizi uzunluğu olarak atar


        System.out.print("Dizinin elemanlarını girin: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        //Tekrar eden sayıları yazdırır
        System.out.print("Tekrar eden sayılar: [ ");
        for (int i: duplicateFunc(array)){
            System.out.print(i+" ");
        }
        System.out.print(" ]");
    }

    static int[] duplicateFunc(int[] array){//Dizi içinde tekrar eden sayıları bulur
        int[] duplicate = new int[(array.length)/2];//tekrar eden dizinin maks uzunluğu
        int index = 0;
        for (int i=0;i< array.length;i++){
            for(int j=0;j<array.length;j++){
                if((i!=j) && array[i]==array[j] && array[i]%2==0 ){
                    //i j'ye eşit olmamalı çünkü indisler aynı olunca tekrar ediyor gibi görünür
                    if(!isThere(duplicate,array[j])){
                        duplicate[index++]=array[i];
                    }
                    break;
                }
            }
        }
        return duplicate;
    }
    static boolean isThere(int[] array,int number){
        //tekrar eden dizide,aynı sayıları tekrar tekrar yazmaktan kurtarır
        for(int i=0;i<array.length;i++){
            if(array[i]==number){
                return true;
            }
        }
        return false;
    }
}