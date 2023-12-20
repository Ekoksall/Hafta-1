import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yukseklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın Yüksekliğini Giriniz (tek sayı olmalı): ");
        yukseklik = input.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek sayı giriniz.");
            return;
        }

        int yarisi = yukseklik / 2;

        for (int i = 0; i <= yarisi; i++) {
            for (int j = 0; j < yarisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yarisi - 1; i >= 0; i--) {
            for (int j = 0; j < yarisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
