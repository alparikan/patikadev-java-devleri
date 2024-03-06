import java.util.Scanner;

public class UsluSayiHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        int n = scan.nextInt();
        System.out.println("Üs olacak sayı : ");
        int k = scan.nextInt();
        int total = 1;

        for(int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println("Cevap : " + total);

    }
}
