import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            words[i] = scanner.nextLine();
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}