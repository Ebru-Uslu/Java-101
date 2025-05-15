import java.util.Scanner;

public class Main {

    static int exponent(int base,int exponent){
        if(exponent==0 ){//Sayının üssü 0 ise cevap 1
            return 1;
        }
        return base*exponent(base, exponent-1);
        //Recursive yapı.Üs değeri giderek azalırken taban her seferinde üsle çarpılır
    }

    public static void main(String[] args) {
        int base,exponent;
        Scanner input= new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        base = input.nextInt();

        System.out.print("Üs değerini girin: ");
        exponent = input.nextInt();

        System.out.println(base+"^"+exponent+"="+exponent(base,exponent));
    }
}