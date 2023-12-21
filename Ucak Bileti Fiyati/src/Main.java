import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, secim = 0;

        Scanner uck = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafeyi KM Cinsinden Yazınız: ");
        mesafe = uck.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = uck.nextInt();
        System.out.println("Lütfen Bilet Türünü Seçiniz:");
        System.out.println("1) Tek Yön\n2) Gidiş Dönüş");
        System.out.print("Seçiminiz: ");
        secim = uck.nextInt();

        if (secim == 1 || secim == 2) {
            double fiyat = mesafe * 0.10;

            if (yas < 12) {
                fiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                fiyat *= 0.9;
            } else if (yas >= 65) {
                fiyat *= 0.7;
            }

            if (secim == 2) {
                fiyat *= 0.8;
            }

            System.out.println("Toplam Bilet Fiyatı: " + fiyat + " TL");
        } else {
            System.out.println("Lütfen Geçerli Bir Sayı Giriniz!");
        }
    }
}
