import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        n = scan.nextInt();

        System.out.println("Girilen sayıdan küçük veya eşit 4'ün Kuvvetleri");
        for(int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Girilen sayıdan küçük veya eşit 5'ün Kuvvetleri");
        for(int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
