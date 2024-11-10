import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            result.append(input);
        }

        System.out.println(result.toString());

    }
}