import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, not;
        double ortalama;

        Scanner ort = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = ort.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Lütfen Geçerli Bir Not Giriniz");
        } else {
            System.out.println("Girilen Kod Geçerli");
        }
        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = ort.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Lütfen Geçerli Bir Not Giriniz");
        } else {
            System.out.println("Girilen Kod Geçerli");
        }
        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = ort.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Lütfen Geçerli Bir Not Giriniz");
        } else {
            System.out.println("Girilen Kod Geçerli");
        }
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = ort.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Lütfen Geçerli Bir Not Giriniz");
        } else {
            System.out.println("Girilen Kod Geçerli");
        }
        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = ort.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Lütfen Geçerli Bir Not Giriniz");
        } else {
            System.out.println("Girilen Kod Geçerli");
        }

        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama < 55) {
            System.out.println("Üzgünüm Sınıfı Geçemediniz!" );
        } else {
            System.out.println("Tebrikler! Sınıfı Geçtiniz");
        }
        System.out.print("Ortalama" + ortalama);

    }
}