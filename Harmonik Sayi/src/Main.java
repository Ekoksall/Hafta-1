import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("n Değeri İçin Bir Sayı Giriniz : ");
        n = inp.nextInt();

        double toplam = 0.0;

        for (int i = 1; i <= n; i++) {
            toplam += (1.0 / i);
        }

        System.out.println("Harmonik Seri : " + toplam);
    }
}
