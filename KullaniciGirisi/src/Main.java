import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,choice;
        Scanner input= new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        userName=input.next();

        System.out.print("Şifre: ");
        password=input.next();

        if(userName.equals("Java")&& password.equals("101")) {
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Hatalı giriş");

            System.out.println("Şifre sıfırlamak ister misiniz?(Evet/Hayır)");
            choice= input.next();

            if(choice.equals("Evet")){
                System.out.print("Yeni şifrenizi girin: ");
                password=input.next();
                while (password.equals("101")) {
                    System.out.println("Yeni şifre son şifreden farklı olmalıdır.Yeni bir şifre girin: ");
                    password=input.next();
                }
                System.out.println("Yeni şifre oluşturuldu");
                System.out.println(password);
            }
        }
    }
}