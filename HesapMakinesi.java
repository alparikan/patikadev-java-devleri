import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = scan.nextInt();

        System.out.println(select);

        switch(select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Lütfen geeçerli bir sayı giriniz");
                break;
        }

    }
}
