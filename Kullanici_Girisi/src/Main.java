
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, nPasword;
        int secim;

        Scanner grs = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz :");
        userName = grs.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz :");
        password = grs.nextLine();

        if (userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Bilgiler Yanlış! Şifrenizi Sıfırlamak İster misiniz?");

            System.out.println("1)Evet\n2)Hayır");
            System.out.println("Seçiniz");
            secim = grs.nextInt();
            grs.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Yeni Şifre Giriniz :");
                    nPasword = grs.nextLine();
                    if (!nPasword.equals(password)) {
                        System.out.println("Şifre oluşturuldu!");
                    }else{
                        System.out.println("Yeni şifreniz eski şifre ile aynı olamaz. Şifre oluşturulamadı.");
                    }
                    break;
                case 2:
                    System.out.print("Şifrenizi Tekrar Giriniz :");
                    password = grs.nextLine();
                    if (password.equals(password)) {
                        System.out.print("Giriş Başarılı!");
                    } else {
                        System.out.print("Şifrenizi Tekrar Giriniz :");
                        password = grs.nextLine();
                    }
                    break;
                default:
                    System.out.println("Lütfen İşlem Yapınız!");
            }
        }

    }
}