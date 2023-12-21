import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String cinZodyagi = hesaplaCinZodyagi(dogumYili);

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }

    private static String hesaplaCinZodyagi(int dogumYili) {
        String[] zodyakListesi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Tavşan", "Kaplan", "Ejderha", "Yılan", "At", "Koyun"};

        int indeks = dogumYili % 12;
        return zodyakListesi[indeks];
    }
}
