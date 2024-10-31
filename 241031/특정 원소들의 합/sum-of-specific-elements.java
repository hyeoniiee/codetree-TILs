import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        sum += grid[0][0];
        sum += grid[1][0] + grid[1][1];
        sum += grid[2][0] + grid[2][1] + grid[2][2];
        sum += grid[3][0] + grid[3][1] + grid[3][2] + grid[3][3];

        System.out.println(sum);

    }
}