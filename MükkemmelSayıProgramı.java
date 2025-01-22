import java.util.Scanner;

public class MükkemmelSayıProgramı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = scan.nextInt();
        int i = 1;
        int numdiv = 0;

        while(i < num) {
            if((num % i) == 0) {
                numdiv += i;

            }
            i++;
        }
        if(numdiv == num) {
            System.out.println(num + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }
    }
}
