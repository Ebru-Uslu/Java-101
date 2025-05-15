import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers,min=Integer.MAX_VALUE,max=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        numbers= input.nextInt();

        for(int i=1;i<=numbers;i++){//döngü girilen sayıya kadar çalışır
            System.out.print(i+". sayıyı girin: ");
            int num= input.nextInt();
            if(num<min) {//her döngüde bir önceki min değerle karşılaştırır
                min=num;
            }
            if(num>max){//her döngüde bir önceki max değerle karşılaştırır
                max=num;
            }
        }
        System.out.println("En küçük sayı: "+min);
        System.out.println("En büyük sayı: "+max);
    }
}



