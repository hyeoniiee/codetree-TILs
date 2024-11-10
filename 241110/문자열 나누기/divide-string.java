import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        StringBuilder combined = new StringBuilder();
        for (int i = 0; i < n; i++) {
            combined.append(scanner.next());
        }

        String result = combined.toString();
        int length = result.length();
        for (int i = 0; i < length; i += 5) {
            System.out.println(result.substring(i, Math.min(i + 5, length)));
        }

    }
}