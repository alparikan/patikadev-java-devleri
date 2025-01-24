import java.util.Scanner;

public class PalindromSayılar {

    public static void palindromMu(int num) {
        int gecici = num, tersi = 0, kalan = 0;

        while(gecici != 0) {
           kalan = gecici % 10;
           tersi = (tersi * 10) + kalan;
           gecici /= 10;
        }
        if(num == tersi) {
            System.out.println(num + " is a palindromic number.");
        }
        else {
            System.out.println(num + " is not a palindromic number.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int a = scan.nextInt();
        palindromMu(a);
    }
}
