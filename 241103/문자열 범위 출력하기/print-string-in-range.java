import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() >= 10) {
            System.out.println(input.substring(2, 10));
        }

    }
}