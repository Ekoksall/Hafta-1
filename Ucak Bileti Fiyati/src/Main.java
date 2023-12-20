import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, secim = 0;

        Scanner uck = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafeyi KM Cinsinden Yazınız :");
        mesafe = uck.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz :");
        yas = uck.nextInt();
        System.out.println("Lütfen Bilet Türünü Seçiniz :");
        System.out.println("1) Tek Yön\n2) Gidiş Dönüş");
        System.out.print("Seçiminiz :");
        secim = uck.nextInt();
        if (secim == 1 || secim == 2) {
            System.out.print("Seçiminiz :" + secim);
        } else {
            System.out.print("Lütfen Geçerli Bir Sayı Giriniz!");
        }


    }
}
