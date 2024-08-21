import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + " ");
                if (k % 2 == 0) {
                    i += 1;
                } else {
                    i += 2;
                }
            }
            if (k % 2 == 0) {
                i += 1;
            } else {
                i -= 1;
            }
            System.out.println();
        }
    }
}