import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int end = N;
        StringBuilder result = new StringBuilder();

        while (end > 0) {
            int maxIndex = 0;

            for (int i = 1; i < end; i++) {
                if (numbers[i] > numbers[maxIndex]) {
                    maxIndex = i;
                }
            }

            result.append(maxIndex + 1).append(" ");

            end = maxIndex;
        }

        System.out.println(result.toString().trim());

    }
}