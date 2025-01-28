import java.util.Scanner;

public class RecursivePattern {

    public static void generatePattern(int number, int original, boolean isDecreasing) {
        System.out.print(number + " "); // Sayıyı yazdır

        if (number <= 0) {
            isDecreasing = false;
        }

        if (!isDecreasing && number == original) {
            return;
        }


        if (isDecreasing) {
            generatePattern(number - 5, original, true);
        } else {
            generatePattern(number + 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        generatePattern(n, n, true);
    }
}