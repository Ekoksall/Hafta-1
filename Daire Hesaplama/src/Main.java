import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r, a;  // a = alfa
        double pi = 3.14;

        Scanner aln = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz :");
        r = aln.nextInt();
        System.out.print("Alfa Değerini Giriniz :");
        a = aln.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Alanı :" + alan);

    }
}