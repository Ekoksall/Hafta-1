import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                // İlk olarak değerlerimizi tanımlayalım.
        int asayisi, bsayisi, csayisi, formul;


        Scanner artmtk = new Scanner(System.in);

                // Daha sonra burada kullanıcıdan değer girmesini isteyelim.

            System.out.print("Lütfen İlk Değeri Giriniz :");
            asayisi = artmtk.nextByte();
            System.out.print("Lütfen İkinci Değeri Giriniz :");
            bsayisi = artmtk.nextByte();
            System.out.print("Lütfen Üçüncü Değeri Giriniz :");
            csayisi = artmtk.nextByte();

                  // Son olarak işlem formülümüzü yazalım ve sonucu görelim.

             formul = asayisi + bsayisi * csayisi - bsayisi ;
             System.out.print("Sonuç : " + formul);

    }
}