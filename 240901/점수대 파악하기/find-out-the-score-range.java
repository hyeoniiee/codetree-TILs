import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[11];

        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }

            if (score >= 10) {
                int index = score / 10;
                count[index]++;
            }
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println((i * 10) + " - " + count[i]);
        }
    }
}