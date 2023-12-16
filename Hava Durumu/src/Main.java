import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner heat = new Scanner(System.in);

        System.out.print("Lütfen Sıcaklığı Giriniz :");
        sıcaklık = heat.nextInt();

        if (sıcaklık < 5){
            System.out.print("Kayak Yapmak İçin Güzel Hava!");
        } else if (sıcaklık <=15) {
            System.out.println("Sinemaya Gitmek İçin Güzel Birgün!");
        }
        if (sıcaklık >= 15 && sıcaklık <=25){
            System.out.print("Tam Piknik Havası!");
        }else if (sıcaklık >= 25) {
            System.out.print("Yüzerek Sıcaktan Kaçabilirsiniz!");
        }

    }
}