import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0, toplamtutar;
        int armutkilo, elmakilo, domateskilo, muzkilo, patlıcankilo;

        Scanner mnv = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız :");
        armutkilo = mnv.nextInt();
        System.out.print("Kaç Kilo Elma Aldınız :");
        elmakilo = mnv.nextInt();
        System.out.print("Kaç Kilo Domates Aldınız : ");
        domateskilo = mnv.nextInt();
        System.out.print("Kaç Kilo Muz Aldınız :");
        muzkilo = mnv.nextInt();
        System.out.print("Kaç Kilo Patlıcan Aldınız :");
        patlıcankilo = mnv.nextInt();

        toplamtutar = (armutkilo * armut) + (elmakilo * elma) + (domateskilo * domates) + (muzkilo * muz) + (patlıcankilo * patlıcan);
        System.out.print("Ödenecek Toplam Tutar :" + toplamtutar);


    }
}