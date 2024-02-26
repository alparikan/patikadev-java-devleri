import java.util.Scanner;

public class CiftSayilarToplam {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz : ");
            n = scan.nextInt();

            if((n % 2) == 0){
                total += n;
            }

        } while((n % 2) == 0);

        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı : " + total);

    }
}
