import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı Giriniz: ");
        yil = inp.nextInt();

        if (artikyil(yil)) {
            System.out.println(yil + " yılı bir artık yıldır.");
        } else {
            System.out.println(yil + " yılı bir artık yıl değildir.");
        }
    }
    private static boolean artikyil(int yil) {

        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }
}
