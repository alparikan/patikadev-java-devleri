import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int resultnum = 1;
        int num1 = 0;
        int num2 = 1;

        while(resultnum < 9) {
            result = (num1 + num2);
            System.out.println(num1 + " + " + num2 + " = " + result);
            num1 = num2;
            num2 = result;
            resultnum++;
        }
    }
}
