/* Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
 Bu fazladan gün (artık gün), normalde 28 gün olan Şubat ayına
 29 Şubat’ın eklenmesi ile elde edilir.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl girin: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if(year %100==0) {
                if (year%400==0) {
                    System.out.print(year + " bir artık yıldır !");
                    return;
                }
                else {
                    //sayı 100ün katı olduğu halde 400e bölünemiyorsa artık yıl değildir
                    System.out.print(year + " bir artık yıl değildir !");
                    return;
                }
            }//4e bölünebiliyorsa artık yıl
            System.out.print(year + " bir artık yıldır !");
        }
        else {
            System.out.print(year + " bir artık yıl değildir !");
        }
    }
}