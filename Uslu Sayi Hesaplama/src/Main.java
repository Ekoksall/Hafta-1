import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, k;

        System.out.print("Taban Sayısını Giriniz: ");
        n = inp.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        k = inp.nextInt();

        long sonuc = 1;

        for (int i = 1; i <= k; i++) {
            sonuc *= n;
        }

        System.out.println(n + "^" + k + " = " + sonuc);
    }
}
