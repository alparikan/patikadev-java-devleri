import java.util.Scanner;
public class RecursivePrime {
    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }
}
