import java.util.Scanner;

public class HavaSıcaklıgı {
    public static void main(String[] args) {
        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = scan.nextInt();

        if(heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if(heat >= 5 && heat <= 25) {
            if(heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if(heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }
        if(heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
