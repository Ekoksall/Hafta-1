
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int a, b, c;

                Scanner girdi = new Scanner(System.in);
                System.out.print("A Kenarının Değerini Yazınız :");
                a = girdi.nextInt();
                System.out.print("B Kenarının Değerini Yazınız :");
                b = girdi.nextInt();
                System.out.print("c Kenarınn değerini Yazınız : ");
                c = girdi.nextInt();

                    double u = (a + b + c) /2;
                    double alan = Math.sqrt( u * (u - a) * (u - b) * (u - c));
                    System.out.print("Üçgenin Alanı :" + alan );



            }
}