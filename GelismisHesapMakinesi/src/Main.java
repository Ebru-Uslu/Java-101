import java.util.Scanner;

public class Main {

    static void addition(int num1,int num2){
        System.out.println("Sayıların toplamı: "+(num1+num2));
    }

    static void substraction(int num1,int num2){
        System.out.println("Sayıların farkı: "+(num1-num2));
    }

    static void multiplication(int num1,int num2){
        System.out.println("Sayıların çarpımı: "+(num1*num2));
    }

    static void division(int num1,int num2){
        if(num2==0){
            System.out.println("0'a bölme hatası");
            return;
        }
        System.out.println("Sayıların bölümü: "+(num1/num2));
    }
    static void exponent(int num1,int num2){
        int result=1;
        for(int i=0;i<num2;i++){
            result*=num1;
        }
        System.out.println(num1+"^"+num2+"="+result);
    }

    static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    static void mod(int num1,int num2){
        System.out.println(num1+" sayısının "+num2+"ye göre modu: "+(num1%num2));
    }

    static void perimeterAndArea(int num1,int num2) {
        System.out.println("Dikdörtgenin çevresi: "+(2*(num1+num2)));
        System.out.println("Dikdörtgenin alanı: "+(num1*num2));

    }

    public static void main(String[] args) {
        int num1,num2,choice;
        Scanner input= new Scanner(System.in);
        String menu= "1.Toplama İşlemi" + "\n" +
                "2.Çıkarma İşlemi" + "\n" +
                "3.Çarpma İşlemi" + "\n"+
                "4.Bölme İşlemi" + "\n"+
                "5.Üslü Sayı Hesaplama" + "\n"+
                "6.Faktöriyel Hesaplama" + "\n"+
                "7.Mod Alma" + "\n"+
                "8.Dikdörtgen Alan ve Çevre Hesabı" +"\n"+
                "0. Çıkış" ;

        System.out.println(menu);

        while (true){
            System.out.print("Yapmak istediğiniz işlemi girin: ");
            choice=input.nextInt();

            if(choice==0){
                break;
            }

            System.out.print("1.Sayı: ");
            num1= input.nextInt();

            System.out.print("2.Sayı: ");
            num2=input.nextInt();

            switch (choice){
                case 1:
                    addition(num1,num2);
                    break;
                case 2:
                    substraction(num1,num2);
                    break;
                case 3:
                    multiplication(num1,num2);
                    break;
                case 4:
                    division(num1,num2);
                    break;
                case 5:
                    exponent(num1,num2);
                    break;
                case 6:
                    System.out.println(num1+" faktöriyel: "+factorial(num1));
                    break;
                case 7:
                    mod(num1,num2);
                    break;
                case 8:
                    perimeterAndArea(num1,num2);
                    break;
                default:
                    System.out.println("Geçersiz bir giriş yaptınız!");
                    break;
            }

        }
    }
}