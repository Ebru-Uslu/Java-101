import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total=0;
        int first=0,second=1;//birinci ve ikinci toplayan
        Scanner input= new Scanner(System.in);

        System.out.print("Serinin eleman sayısını girin: ");
        number= input.nextInt();

        for(int a=1;a<number;a++){
            total=first+second;
            System.out.println(first+ " + "+ second+ " = "+ total);
            first=second;
            second=total;//bir sonraki adımın 2 toplayanı bir önceki işlemin sonucudur
        }

    }
}