import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = scanner.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Bilgiler Yanlış! Şifrenizi Sıfırlamak İster misiniz?");
            System.out.println("1) Evet\n2) Hayır");
            System.out.print("Seçiminizi Yapınız: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Boş satırı temizle

            switch (choice) {
                case 1:
                    System.out.print("Yeni Şifre Giriniz: ");
                    newPassword = scanner.nextLine();

                    // Yeni şifrenin eski şifre ile aynı olup olmadığını kontrol et
                    if (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturuldu!");
                    } else {
                        System.out.println("Yeni şifreniz eski şifre ile aynı olamaz. Şifre oluşturulamadı.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. İşlem iptal edildi.");
                    break;
            }
        }

        scanner.close();
    }
}