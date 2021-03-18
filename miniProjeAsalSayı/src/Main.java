public class Main {

    public static void main(String[] args) {
        int number = 2;
        int remainder = number % 2;
        boolean isPrime = true;

        if (isPrime) {
            System.out.println("sayı asaldır.");
        }
        if (number == 1) {
            System.out.println("sayı asal değildir.");
            return;
        }
        if (number < 1) {
            System.out.println("geçersiz sayı.");

        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
    }
}
