public class Main {
    public static void main(String[] args) {

        System.out.println("1 - 100 Arasındaki Asal Sayılar:");

        for (int i = 2; i <= 100; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean asalMi(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
