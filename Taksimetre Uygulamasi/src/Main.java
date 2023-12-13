import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20, tutar = 0, baslangicucreti = 10, mintutar = 20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi KM Olarak Yazınız :");
        km = input.nextInt();

        tutar = (perkm * km );
        tutar += baslangicucreti;

        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Ödenecek Tutar :" + tutar);





    }
}