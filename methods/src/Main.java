public class Main {

    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varmi = false;
        for (int sayi : sayılar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }

        }
        if (varmi) {
            System.out.println("sayı mevcuttur.");
        } else {
            System.out.println("sayı mevcut değildir.");

        }
    }
}
