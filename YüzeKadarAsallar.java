import java.util.Scanner;

public class YüzeKadarAsallar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for(int i = 2; i <= 100; i++) {
            int bölen = 0;
            for(int j = 1; j <= i; j++) {
                if((i % j) == 0) {
                    bölen++;
                }
            }
            if(bölen == 2) {
                System.out.println(i + " ");
            }
        }
    }
}
