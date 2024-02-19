import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double km, age, options, price;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = scan.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        age = scan.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        options = scan.nextDouble();
        price = km * 0.10;

        if(age < 12) {
            price /= 2;
        }
        else if(age >= 12 && age <= 24) {
            price = price - (price * 0.1);
        }
        else if(age < 65) {
            price = price - (price * 0.3);
        }


        if(options == 2) {
            price = price - (price * 0.2);
            price *= 2;
        }



        if(km < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else if(age < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else if(options != 1 && options != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else {
            System.out.println("Toplam Tutar = " + price + " TL");
        }
    }
}
