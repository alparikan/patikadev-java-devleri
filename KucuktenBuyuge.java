import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Sayı: ");
        a = scan.nextInt();

        System.out.println("2. Sayı: ");
        b = scan.nextInt();

        System.out.println("3. Sayı: ");
        c = scan.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + ">" + b + ">" + c);
            }
            if (c > b) {
                System.out.println(a + ">" + c + ">" + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + ">" + a + ">" + c);
            }
            if (c > a) {
                System.out.println(b + ">" + c + ">" + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + ">" + a + ">" + c);
            }
            if (b > a) {
                System.out.println(c + ">" + b + ">" + a);
            }
        }
    }
}
