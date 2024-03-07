import java.util.Scanner;

public class BasamaklarToplam {
    public static void main(String[] args) {
        int a, b, basamakSayisi = 0, basamakToplami = 0, geciciSayi;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayıyı giriniz : ");
        a = scan.nextInt();
        b = a;

        while (a != 0) {
            a /= 10;
            basamakSayisi++;
        }

        for(int i = 1; i <= basamakSayisi; i++) {
            geciciSayi = b % 10;
            b /= 10;
            basamakToplami += geciciSayi;
        }

        System.out.println("Sayının basamakları toplamı : " + basamakToplami);

    }
}
