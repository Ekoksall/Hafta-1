import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;

        System.out.print("n Değerini Yazınız : ");
        n = inp.nextInt();
        System.out.print("r Değerini Yazınız : ");
        r = inp.nextInt();

        long kmbnsyn = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            kmbnsyn *= (n - i);
            kmbnsyn /= (i + 1);
        }
        System.out.println("C(" + n + ", " + r + ") = " + kmbnsyn);
    }
}
