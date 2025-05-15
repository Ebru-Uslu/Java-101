import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mark,counter=0,total=0;
        double average= 0;

        Scanner input = new Scanner(System.in);

        String [] lessons=new String[] {"Matematik","Fizik","Kimya","Türkçe","Müzik"};

        for(int i=0;i<lessons.length;i++){
            System.out.print(lessons[i]+" notunuzu girin: ");
            mark= input.nextInt();
            if(mark>=0 && mark<=100) {
                total+=mark;
                counter++;
            }
            else{
                System.out.println("Geçersiz not girişi!");
            }
        }
        average=total/counter;
        if (average<=55){
            System.out.print("Sınıfta kaldınız.Seneye görüşürüz");
        }
        else {
            System.out.print("Tebrikler sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız: "+average);
    }
}