import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String month, horoscope=" ";
        int day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü girin: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ayı girin: ");
        month = input.next();


        if (day > 0 && day <= 31) {
            if (month.equals("Ocak")) {
                if (day < 22) {
                    horoscope = "Oğlak";
                }
                else {
                    horoscope = "Kova";
                }
            }
            if (month.equals("Şubat")) {
                if (day < 20) {
                    horoscope = "Kova";
                }
                else {
                    horoscope = "Balık";
                }
            }
            if (month.equals("Mart")) {
                if (day < 21) {
                    horoscope = "Balık";
                }
                else {
                    horoscope = "Koç";
                }
            }
            if (month.equals("Nisan")) {
                if (day < 21) {
                    horoscope = "Koç";
                }
                else {
                    horoscope = "Boğa";
                }
            }
            if (month.equals("Mayıs")) {
                if (day < 22) {
                    horoscope = "Boğa";
                }
                else {
                    horoscope = "İkizler";
                }
            }
            if (month.equals("Haziran")) {
                if (day < 23) {
                    horoscope = "İkizler";
                }
                else {
                    horoscope = "Yengeç";
                }
            }
             if (month.equals("Temmuz")) {
                if (day < 23) {
                    horoscope = "Yengeç";
                }
                else {
                    horoscope = "Aslan";
                }
            }
             if (month.equals("Ağustos")) {
                if (day < 23) {
                    horoscope = "Aslan";
                }
                else {
                    horoscope = "Başak";
                }
            }
             if (month.equals("Eylül")) {
                if (day < 23) {
                    horoscope = "Başak";
                }
                else {
                    horoscope = "Terazi";
                }
            }
             if (month.equals("Ekim")) {
                if (day < 23) {
                    horoscope = "Terazi";
                }
                else {
                    horoscope = "Akrep";
                }
            }
             if (month.equals("Kasım")) {
                if (day < 22) {
                    horoscope = "Akrep";
                }
                else {
                    horoscope = "Yay";
                }
            } if(month.equals("Aralık")) {
                if (day < 22) {
                    horoscope = "Yay";
                }
                else {
                    horoscope = "Oğlak";
                }
            }
            System.out.println("Burcunuz: "+horoscope);
        }
    }
}