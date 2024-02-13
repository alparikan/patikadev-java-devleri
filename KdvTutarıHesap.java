import java.util.Scanner;

public class KdvTutarıHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tutar, kdvOran = 0, kdvTutar, kdvliTutar;
        System.out.print("Ücret tutarını giriniz: ");
        tutar = scan.nextDouble();

        if(tutar >= 0 && tutar <= 1000) {
            kdvOran = 0.18;
        }
        else if(tutar > 1000) {
            kdvOran = 0.08;
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı:" + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutarı: " + kdvliTutar);




    }
}
