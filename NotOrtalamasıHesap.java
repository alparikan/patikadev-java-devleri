import java.util.Scanner;

public class NotOrtalamasıHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.println("Matematik notunuzu giriniz: ");
        int m = scan.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        int f = scan.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        int k = scan.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        int t = scan.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        int ta = scan.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        int mu = scan.nextInt();

        int ort = (m + f + k + t + ta + mu) / 6;
        System.out.println("Not ortalamanız: " + ort);
        a = (ort >= 70) ? "Sınıfı geçti": "Sınıfta kaldı";
        System.out.println(a);

    }
}
