import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sayi = new Scanner(System.in);

        System.out.print("a Sayısını Giriniz: ");
        a = sayi.nextInt();
        System.out.print("b Sayısını Giriniz: ");
        b = sayi.nextInt();
        System.out.print("c Sayısını Giriniz: ");
        c = sayi.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            } else {
                System.out.print("b < c < a");
            }
        } else {
            if (a > b) {
                System.out.print("c < b < a");
            } else {
                System.out.print("c < a < b");
            }
        }
    }
}
