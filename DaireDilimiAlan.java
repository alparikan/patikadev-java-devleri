import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan;

        Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        r = scan.nextInt();
        System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz: ");
        a = scan.nextInt();

        alan = (pi * (r*r) * a) / 360;
        System.out.println("Daire diliminin alanı : " + alan);

    }
}
