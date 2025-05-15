import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,exponent,product=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        number= input.nextInt();

        System.out.print("Üssü girin: ");
        exponent= input.nextInt();

        for(int i=0;i<exponent;i++){
            if(exponent!=0){//üs 0a eşitse cevap 1
                product*=number;
            }
        }

        System.out.println(number+ "^"+exponent+"="+product );
    }
}