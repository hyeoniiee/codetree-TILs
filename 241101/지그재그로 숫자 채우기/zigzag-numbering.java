import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int num = 0;

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) { 
                for (int i = 0; i < n; i++) {
                    array[i][j] = num++;
                }
            } else { 
                for (int i = n - 1; i >= 0; i--) {
                    array[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}