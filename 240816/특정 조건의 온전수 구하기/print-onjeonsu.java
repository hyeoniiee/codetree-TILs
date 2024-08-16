import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean isWholeNumber = true;

            if (i % 2 == 0) {
                isWholeNumber = false;
            }

            if (i % 10 == 5) {
                isWholeNumber = false;
            }

            if (i % 3 == 0 && i % 9 != 0) {
                isWholeNumber = false;
            }

            if (isWholeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}