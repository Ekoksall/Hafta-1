import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1, sayi2, ebob;

        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = inp.nextInt();

        ebob = 1;
        int i = 1;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
