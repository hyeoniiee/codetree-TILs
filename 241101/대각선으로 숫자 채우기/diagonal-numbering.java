import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        int num = 1;

        for (int diag = 0; diag < n + m - 1; diag++) {
            int row = diag < m ? 0 : diag - m + 1;
            int col = diag < m ? diag : m - 1;

            while (row < n && col >= 0) {
                array[row][col] = num++;
                row++;
                col--;
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