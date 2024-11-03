import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLength = 0;

        for (int i = 0; i < 10; i++) {
            String input = scanner.next();
            totalLength += input.length(); 
        }

        System.out.println(totalLength);

    }
}