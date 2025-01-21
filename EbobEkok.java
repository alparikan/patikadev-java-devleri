import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        int num1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int num2 = scan.nextInt();
        int i = 1;
        int ebob = 0;
        int ekok = 0;
        while((i <= num1) && (i <= num2)) {

            if((num1 % i) == 0 && (num2 % i) == 0) {
                ebob = i;
            }
            i++;

        }
        ekok = ((num1 * num2) / ebob);

        System.out.println("Bu iki sayının EBOB'u:" + ebob);
        System.out.println("Bu iki sayının EKOK'u:" + ekok);
    }
}
