import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int elemanSayisi;

        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        elemanSayisi = inp.nextInt();

        System.out.println("Fibonacci Serisi :");

        int ilkSayi = 0, ikinciSayi = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(ilkSayi + " ");

            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
    }
}
