import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, secim;  //İlk olarak int değerlerimizi tanımlladık.

        Scanner data = new Scanner(System.in); //Daha sonra kullanıcıdan veri almak için nesnemizi oluşturduk.
        System.out.print("İlk Değeri Giriniz :");
        n1 = data.nextInt();
        System.out.print("İkinci Değeri Giriniz :");
        n2 = data.nextInt();

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz");  //Burada kullanıcı yapmak istediği işlemi seçiyor.
        System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        System.out.print("Seçiminiz :");
        secim = data.nextInt();

        switch (secim) {      //En son olarakta seçilen işleme göre program sonucu hesaplıyor ve çıktımızı veriyor.
            case 1:
                System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpım :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölüm :" + (n1 / n2));
                } else {
                    System.out.print("Herhangi Bir Sayı Sıfıra Bölünemez!");
                }
                break;
            default:
                System.out.print("Hatalı Seçim Yaptınız!");
        }

    }


}
