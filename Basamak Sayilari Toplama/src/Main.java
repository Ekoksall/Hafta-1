import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, gecicisayi;

        System.out.print("Bir Sayı Giriniz: ");
        sayi = inp.nextInt();

        int toplam = 0;
        gecicisayi = Math.abs(sayi);

        while (gecicisayi != 0) {
            int basamak = gecicisayi % 10;
            toplam += basamak;
            gecicisayi /= 10;
        }

        System.out.println("Sayının Basamakları Toplamı: " + toplam);
    }
}
