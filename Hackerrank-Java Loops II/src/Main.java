import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç kere döngü işlemi yapılacak: ");
        int t=in.nextInt();
        int total=0;
        for(int i=0;i<t;i++){
            System.out.print("A sayısını girin: ");
            int a = in.nextInt();
            System.out.print("B sayısını girin: ");
            int b = in.nextInt();
            System.out.print("N sayısını girin: ");
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    total+=Math.pow(2,k)*b;
                }
                System.out.print(total+a);
                System.out.print(" ");
                total=0;
            }
            System.out.println(" ");
        }
    }
}