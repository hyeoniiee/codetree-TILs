import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        int[][] grid = new int[n][n];

        for (int i = 1; i <= m; i++) {
            int r = scanner.nextInt() - 1; 
            int c = scanner.nextInt() - 1; 
            grid[r][c] = i; 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}