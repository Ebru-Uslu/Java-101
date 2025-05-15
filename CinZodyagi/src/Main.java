import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program
        int year;
        String horoscope= "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        year= input.nextInt();

        if(year%12==0) {
            horoscope="Maymun";
        }
        else if(year%12==1) {
            horoscope="Horoz";
        }
        else if(year%12==2) {
            horoscope="Köpek";
        }
        else if(year%12==3) {
            horoscope="Domuz";
        }
        else if(year%12==4) {
            horoscope="Fare";
        }
        else if(year%12==5) {
            horoscope="Öküz";
        }
        else if(year%12==6) {
            horoscope="Kaplan";
        }
        else if(year%12==7) {
            horoscope="Tavşan";
        }
        else if(year%12==8) {
            horoscope="Ejderha";
        }
        else if(year%12==9) {
            horoscope="Yılan";
        }
        else if(year%12==10) {
            horoscope="At";
        }
        else if(year%12==11) {
            horoscope="Koyun";
        }
        System.out.print("Burcunuz: "+horoscope);

    }
}