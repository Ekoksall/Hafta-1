import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int kilo ;
        double boy ;

        Scanner ind = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz :");
        boy = ind.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz :");
        kilo = ind.nextInt();

        double sonuc = (kilo / boy ) * boy;


        System.out.print("Vücut Kitle Endeksiniz :" + sonuc);


    }

}