import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy, kilo,kİndeksi;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();
        kİndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + kİndeksi);


    }
}
