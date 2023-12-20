import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        n = inp.nextInt();
        System.out.println("4' ün Katı Olanlar :");
        for (int i = 1; i <= n; i *= 4) {

            System.out.println(i);
        }
        System.out.print("5' in Katı Olanlar :");
        for (int i = 1; i <= n; i *= 5) {

            System.out.println(i);
        }

    }
}