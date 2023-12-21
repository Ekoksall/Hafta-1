import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Tam Sayı Giriniz :");
        int sayiInt = inp.nextInt();
        System.out.print("Lütfen Ondalıklı Bir Sayı Giriniz :");
        double sayiDouble = inp.nextDouble();

        double tamsayi = (double) sayiInt;
        int ondaliklisayi = (int) sayiDouble;

        System.out.println("Tam Sayının Dönüşmüş Hali :" + tamsayi);
        System.out.println("Ondalıklı Sayının Dönüşmüş Hali :" + ondaliklisayi);

    }
}