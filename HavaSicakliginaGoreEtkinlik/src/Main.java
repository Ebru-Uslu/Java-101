import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Orada hava kaç derece?");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gitmek için güzel bir gün.");
        } else if (15 < heat && heat < 25) {
            System.out.println("Arkadaşlarınla pikniğe gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}
