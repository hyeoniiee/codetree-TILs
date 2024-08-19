import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            int starCount;
            if (i % 2 == 0) {
                starCount = 1 + (i / 2);
            } else {
                starCount = n - (i - 1) / 2;
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("*");
    }
}