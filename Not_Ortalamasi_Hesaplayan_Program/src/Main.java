import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner veri = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = veri.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = veri.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = veri.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = veri.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = veri.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = veri.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.print("Ortalamanız : " + sonuc);

        String durum = (sonuc >= 60 ) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(durum);
        




    }
}