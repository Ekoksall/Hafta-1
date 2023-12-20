import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scanner.nextInt();

        if (n > 0) {
            System.out.print("1. sayıyı yazınız : ");
            int sayi = scanner.nextInt();

            int min = sayi;
            int max = sayi;

            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". sayıyı yazınız : ");
                sayi = scanner.nextInt();

                if (sayi < min) {
                    min = sayi;
                }

                if (sayi > max) {
                    max = sayi;
                }
            }

            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);
        } else {
            System.out.println("Lütfen geçerli bir pozitif tamsayı giriniz.");
        }

        scanner.close();
    }
}
