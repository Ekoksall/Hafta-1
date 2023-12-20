import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        sayi = inp.nextInt();

        if (sayi > 0) {
            if (mukemmelsayi(sayi)) {
                System.out.println(sayi + " Mükemmel Bir Sayıdır!");
            } else {
                System.out.println(sayi + " Mükemmel Bir Sayı Değildir!");
            }
        } else {
            System.out.println("Lütfen Geçerli Bir Pozitif Giriniz.");
        }

    }

    static boolean mukemmelsayi(int num) {
        int toplam = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                toplam += i;
            }
        }

        return toplam == num;
    }
}
