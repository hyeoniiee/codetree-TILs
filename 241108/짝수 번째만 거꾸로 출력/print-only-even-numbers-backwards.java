import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        System.out.println(result.reverse().toString());

    }
}