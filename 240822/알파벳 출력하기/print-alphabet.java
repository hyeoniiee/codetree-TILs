import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char currentChar = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
            System.out.println();
        }
    }
}