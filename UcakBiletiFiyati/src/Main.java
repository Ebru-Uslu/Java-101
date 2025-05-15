import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,tripType,age;
        double total;
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi kilometre cinsinden girin: ");
        distance= input.nextInt();

        System.out.print("Yaşınızı girin: ");
        age= input.nextInt();

        System.out.print("Yolculuk türünü girin (1:Tek Yön 2:Gidiş-Dönüş ) ");
        tripType= input.nextInt();

        total= distance*0.1;

       if(distance>0 && age>0 && (tripType==1 || tripType==2) ){
           if(age<12) {
               total= total*0.5; // %50 indirim
           }
           if(age>12 && age<24) {
               total= total*0.9; // %10 indirim
           }
           if(age>65) {
               total= total*0.7;// %30 indirim
           }
       }
       else {
           System.out.println("Hatalı veri girdiniz!");
           return;

       }
        if(tripType==1){
            System.out.println("Toplam tutar: "+total);
        }
       else if(tripType==2) {
           total=0.8*total*2;//Gidiş dönüşte %20 ek indirim
           System.out.println("Toplam tutar: "+total);
       }
    }
}