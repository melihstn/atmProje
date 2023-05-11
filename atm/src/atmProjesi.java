import java.sql.SQLOutput;
import java.util.Scanner;


public class atmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if(userName.equals("patika")&&password.equals("dev123")) {
                System.out.println("Merhaba üstün banka hoş geldidniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgulama \n" +
                            "4- Çkıkış yap");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("para miktarı :");
                           int price= input.nextInt();
                           balance += price;
                           System.out.println("güncel bakiyeniz : " + balance);
                           break;
                        case 2:
                            System.out.print("para miktari : ");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.println("bakiyeniz yetersiz.");
                                break;
                            }else {
                                balance-=price;
                                System.out.println("bakiyeyniz : " + balance );
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz : " + balance );
                            break;


                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere ");
                break;
            }else {
                right --;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur lütfen banka ile ietişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }


    }
}
