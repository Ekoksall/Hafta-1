import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int secenek;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Bilgiler Yanlış! Şifrenizi Sıfırlamak İster misiniz?");
            System.out.println("1) Evet\n2) Hayır");
            System.out.print("Seçiniz: ");
            secenek = input.nextInt();
            input.nextLine();

            if (secenek == 1) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.nextLine();
                if (!newPassword.equals(password) && !newPassword.equals(userName)) {
                    password = newPassword;
                    System.out.println("Şifre Başarıyla Oluşturuldu!");
                } else {
                    System.out.println("Hata: Yeni Şifre, Eski Şifre veya Kullanıcı Adı ile Aynı Olamaz. Lütfen Farklı Bir Şifre Giriniz!");
                }
            } else if (secenek == 2) {
                System.out.println("İşlem İptal Edildi. Lütfen Giriş Bilgilerinizi Kontrol Ediniz!");
            } else {
                System.out.println("Hata: Geçersiz Seçim! Lütfen 1 veya 2' yi Seçiniz!");
            }
        }
    }
}