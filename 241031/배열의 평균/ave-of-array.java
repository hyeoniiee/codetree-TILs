import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            double rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += numbers[i][j];
            }
            System.out.printf("%.1f ", rowSum / 4);
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            double colSum = 0;
            for (int i = 0; i < 2; i++) {
                colSum += numbers[i][j];
            }
            System.out.printf("%.1f ", colSum / 2);
        }
        System.out.println();

        double totalSum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                totalSum += numbers[i][j];
            }
        }
        System.out.printf("%.1f\n", totalSum / 8);
    }
}