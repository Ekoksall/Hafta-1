import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        double ortalama = 0;
        int derssayisi = 0;

        Scanner ort = new Scanner(System.in);

        mat = notuAl("Matematik", ort);
        fizik = notuAl("Fizik", ort);
        turkce = notuAl("Türkçe", ort);
        kimya = notuAl("Kimya", ort);
        muzik = notuAl("Müzik", ort);

        if (gecerliNot(mat)) {
            ortalama += mat;
            derssayisi++;
        }

        if (gecerliNot(fizik)) {
            ortalama += fizik;
            derssayisi++;
        }

        if (gecerliNot(turkce)) {
            ortalama += turkce;
            derssayisi++;
        }

        if (gecerliNot(kimya)) {
            ortalama += kimya;
            derssayisi++;
        }

        if (gecerliNot(muzik)) {
            ortalama += muzik;
            derssayisi++;
        }

        if (derssayisi > 0) {
            ortalama /= derssayisi;

            if (ortalama < 55) {
                System.out.println("Üzgünüm, Sınıfı Geçemediniz!");
            } else {
                System.out.println("Tebrikler! Sınıfı Geçtiniz");
            }
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Hiç Geçerli Not Girilmediği İçin Ortalama Hesaplanamıyor.");
        }
    }

    private static int notuAl(String dersAdi, Scanner scanner) {
        System.out.print(dersAdi + " Notunuzu Giriniz: ");
        return scanner.nextInt();
    }

    private static boolean gecerliNot(int not) {
        return not >= 0 && not <= 100;
    }
}
