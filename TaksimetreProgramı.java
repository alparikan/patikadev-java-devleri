import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Katedilen kilometreyi giriniz: ");
        double mesafe = scan.nextDouble();
        int baslama = 10;
        double tutar = baslama + (mesafe * 2.20);

        if(tutar < 20) {
            tutar = 20;
        }

        System.out.println("Ödenecek tutar: " + tutar);
    }
}
