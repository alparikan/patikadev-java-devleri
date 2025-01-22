import java.util.Scanner;

public class BüyükVeKüçükSayı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int num = scan.nextInt();
        int round = num;
        int numround = 1;
        int bignum = -999999999;
        int smallnum = 999999999;

        while(round > 0) {
            System.out.println(numround + ". Sayıyı giriniz: ");
            int nums = scan.nextInt();
            if(nums > bignum) {
                bignum = nums;
            }
            if(nums < smallnum) {
                smallnum = nums;
            }

            round--;
            numround++;
        }
        System.out.println("En büyük sayı: " + bignum);
        System.out.println("En küçük sayı: " + smallnum);
    }
}
