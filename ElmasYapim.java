import java.util.Scanner;

public class ElmasYapim {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tek sayı giriniz:");
        int n = scan.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = n; j > (n - i); j--) {
                System.out.print(" ");
            }
            for (int k = n; k >= (2 * i + 1); k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
