import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı girin: ");
        num1= input.nextInt();

        System.out.print("2.sayıyı girin: ");
        num2= input.nextInt();

        int i=1;
        //EKOK
        //Ekok için worst case sayıların aralarında asal olma durumudur.
        // O yüzden döngü ikisinin çarpımına kadar devam eder
        while (i<=num1*num2) {
            if(i%num1==0 && i%num2==0){ //iki sayının en küçük ortak katına eşit olduğunda
                System.out.println(num1 + " ve " + num2 + " sayılarının ekok değeri: "+i);
                break;
            }
            i++;
        }

        //EBOB
        int temp;
        if(num1>num2) {
           temp=num2;
        }
        else{
            temp=num1;
        }
        while (temp>0) {//küçük olan sayıya göre işlem yapılır.Çünkü 18 ve 24ün ebob'u 19 olamaz
            if(num1%temp==0 && num2%temp==0){//iki sayının en büyük ortak bölenine eşit olduğunda
                System.out.println(num1 + " ve " + num2 + " sayılarının ebob değeri: "+temp);
                break;
            }
            temp--;
        }
    }
}