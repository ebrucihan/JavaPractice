package Week1;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String userName,Password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while(right >0) {
            // Kullanıcıdan kullanıcı adı ve şifre isteniyor.
            System.out.print("Kullanıcı adınız: ");
            userName= input.nextLine();
            System.out.print("Şifreniz: ");
            Password = input.nextLine();

            if (userName.equals("ebrucihan") && Password.equals("java123")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    // Kullanıcının seçimine göre işlem yapılır.
                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı:" );
                            int price= input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            price= input.nextInt();
                            if(price > balance) {
                                System.out.println("Bakiye yeteriz!");

                            }else{
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while(select != 4); // Çıkış seçilene kadar döngü devam eder.
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }else{
                // Kullanıcı adı veya şifre yanlışsa hakkı bir azaltılır.
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right ==0 ) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    // Kullanıcıya kalan hakkı gösterilir.
                    System.out.println("Kalan Hakkınız: " +right);
                }
            }
        }





    }
}
