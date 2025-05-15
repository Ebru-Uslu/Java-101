import java.util.Scanner;

public class Main {

    static void pattern(int num,int temp,int count){
        if(num==temp){//Sayı tekrar ilk haline geldiğinde program durur
            System.out.print(temp);
            return;}

        System.out.print(temp+" ");//Her işlem adımında sayıyı yazdırır
        if(temp<=0){//Sayı bir kere negatif veya 0 olduğunda işlem de -5'ten +5e döner
            count=5;
        }
        pattern(num,temp+count,count);//Recursive çağrısı
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı: ");
        number= input.nextInt();

        System.out.print("Çıktısı : "+number+" ");

        pattern(number,number-5,-5);
        //Başlangıç değerleriyle metot çağrısı
    }
}