import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {
        String userName, password;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = scan.nextLine();

        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            int x = scan.nextInt();
            scan.nextLine(); // Consume newline character

            if(x == 1) {
                System.out.print("Yeni şifreniz: "); // Yeni şifre yazısı buraya taşındı
                String password2 = scan.nextLine();

                if(password2.equals("patika") || password2.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else if(x == 2) {
                System.out.println("Eski şifrenizle devam ediyorsunuz");
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz!");
            }
        }
    }
}