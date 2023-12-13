import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       double tutar, kdvOranı = 0.18, kdvTutar, kdvliTutar;

       Scanner input = new Scanner(System.in);
       System.out.print("Ödenecek Tutarı Giriniz :");
       tutar = input.nextDouble();

       if (tutar > 0 && tutar <= 1000 ) {
           kdvOranı = 0.18;
        } else {
           kdvOranı = 0.08;
          }

            kdvTutar = tutar * kdvOranı;
            kdvliTutar = tutar + kdvTutar;
                System.out.println("KDV'siz Tutar :" + tutar);
                System.out.println("KDV Oranı :" + kdvOranı);
                System.out.println("KDV Tutarı : " + kdvTutar);
                System.out.println("KDV'li Tutar : " + kdvliTutar);

    }
}