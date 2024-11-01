import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        int num = 1;

        for (int j = n - 1; j >= 0; j--) {
            if ((n - 1 - j) % 2 == 0) { 
                for (int i = n - 1; i >= 0; i--) {
                    array[i][j] = num++;
                }
            } else { 
                for (int i = 0; i < n; i++) {
                    array[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}