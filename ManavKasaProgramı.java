import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        System.out.println("Armut Kaç Kilo ? :");
        double k1 = scan.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        double k2 = scan.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        double k3 = scan.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        double k4 = scan.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        double k5 = scan.nextDouble();

        double toplam = (k1 * armut) + (k2 * elma) + (k3 * domates) + (k4 * muz) + (k5 * patlıcan);
        System.out.println("Toplam Tutar: " + toplam);

    }
}
