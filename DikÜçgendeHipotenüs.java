import java.util.Scanner;

public class DikÜçgendeHipotenüs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C;
        double toplam, tyarısı, alan;

        System.out.println("1. kenar uzunluğunu giriniz: ");
        A = scan.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz: ");
        B = scan.nextInt();
        System.out.println("3. kenar uzunluğunu giriniz: ");
        C = scan.nextInt();

        toplam = A + B + C;
        tyarısı = toplam / 2;
        alan = Math.sqrt(tyarısı * (tyarısı - A) * (tyarısı - B) * (tyarısı - C));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
