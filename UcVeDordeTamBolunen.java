import java.util.Scanner;

public class UcVeDordeTamBolunen {
    public static void main(String[] args) {
        int num, c = 0;
        double k = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            if((i % 3) == 0 || (i % 4) == 0) {
                k++;
                c += i;
            }
        }
        System.out.println("0'dan girdiğiniz sayıya kadar, 3 ve 4'e bölünen sayıların ortalaması = " + (c / k));
    }
}
