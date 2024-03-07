import java.util.Scanner;

public class SayininHarmonikSerisi {
    public static void main(String[] args) {
        double toplam = 0, a, i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayıyı giriniz : ");
        a = scan.nextInt();

        for(i = 1; i <= a; i++) {
            toplam += (1 / i);
        }

        System.out.println("Girilen sayının harmonik serisi : " + toplam);


    }
}
