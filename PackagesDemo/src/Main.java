import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("adınızı giriniz =");

        String name = scanner.nextLine();
        
        System.out.println("merhaba " + name);

    }
}
