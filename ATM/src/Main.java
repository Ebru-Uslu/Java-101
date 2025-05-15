import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int right=3,choice,balance=1500;
        Scanner input = new Scanner(System.in);

        while (right>0){//Kullanıcının 3 defa giriş yapma hakkı var
            System.out.print("Kullanıcı adı: ");
            userName= input.nextLine();

            System.out.print("Şifre: ");
            password= input.nextLine();

            if(userName.equals("Vice City") && password.equals("leavemealone")) {
                System.out.println("Giriş başarılı !");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçin: "+
                            "\n 1.Para yatırma"+
                            "\n 2.Para çekme"+
                            "\n 3.Bakiye görüntüleme"+
                            "\n 4.Çıkış");

                    choice=input.nextInt();

                    switch (choice){//işlem seçenekleri
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı girin: ");
                            int price1= input.nextInt();
                            balance+=price1;
                            System.out.println("Mevcut bakiyeniz: "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı girin: ");
                            int price2= input.nextInt();
                            if(price2>balance){
                                System.out.println("Bakiye yetersiz");
                            }
                            balance-=price2;
                            System.out.println("Mevcut bakiyeniz: "+balance);
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: "+balance);
                            break;
                    }
                }
                while (choice != 4);//4e basıldığında çıkış yapar
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre.");
                if(right==0) {
                    System.out.println("Hesabınız bloke edildi.Banka ile görüşün");
                }
            }
        }

    }
}



