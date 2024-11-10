import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        String AB = A + B;
        String BA = B + A;

        if (AB.equals(BA)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}