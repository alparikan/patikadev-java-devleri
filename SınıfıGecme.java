import java.util.Scanner;

public class SınıfıGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;
        int gecmeNotu = 55;
        int dersSayisi = 5;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = scan.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = scan.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = scan.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = scan.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = scan.nextInt();


        int gecersizNotSayisi = 0;
        if (mat < 0 || mat > 100) {
            mat = 0;
            gecersizNotSayisi++;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            gecersizNotSayisi++;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            gecersizNotSayisi++;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            gecersizNotSayisi++;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            gecersizNotSayisi++;
        }


        if (gecersizNotSayisi < dersSayisi) {
            ortalama = (mat + fizik + turkce + kimya + muzik) / (double)(dersSayisi - gecersizNotSayisi);
        } else {
            ortalama = 0;
        }


        if (ortalama < gecmeNotu) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Sınıfı Geçtiniz");
        }


        System.out.println("Ortalamanız: " + ortalama);
    }
}