import java.util.Scanner;

public class FaktoriyelHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N'yi giriniz :");
        int n = scan.nextInt();
        System.out.println("r'yi giriniz :");
        int r = scan.nextInt();
        int nk = 1;
        int rk = 1;
        int nrk = 1;

        for(int i = 1; i <= n; i++) {
            nk *= i;
        }

        for(int i = 1; i <= r; i++) {
            rk *= i;
        }

        for(int i = 1; i <= n - r; i++) {
            nrk *= i;
        }

        int c = nk / (rk * nrk);

        System.out.println("N'nin r'li kombinasyonu: " + c);
    }
}
