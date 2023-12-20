import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int secim ;

        Scanner grs = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz :");
        userName = grs.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz :");
        password = grs.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Bilgiler Yanlış! Şifrenizi Sıfırlamak İster misiniz?");

            System.out.println("1)Evet\n2)Hayır");
            System.out.println("Seçiniz");
            secim = grs.nextInt();
            grs.nextLine();

            if (secim == 1 ) {
                System.out.print("Yeni Şifrenizi Giriniz :");
                String npassword = grs.nextLine();
                if (!npassword.equals(password)){
                    System.out.print("Şifre Oluşturuldu!");
                }else {
                    System.out.print("Şifre Oluşturulamadı!Lütfen Eski Şifrenizden Başka Bir Şifre Giriniz!");
                }
            } else if (secim == 2){
                System.out.print("Lütfen Giriş Bilgilerinizi Kontrol Ediniz!");
            }else{
                System.out.print("Lütfen 1 veya 2' yi Seçiniz!");
            }



        }

    }
}