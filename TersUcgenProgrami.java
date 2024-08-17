import java.util.Scanner;

public class TersUcgenProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = scan.nextInt();

        for (int i = 1; i <= n ; i++) {
            for(int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
