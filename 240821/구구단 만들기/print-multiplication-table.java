import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = b; i >= a; i -= 2) {
            for (int j = 1; j <= 9; j++) {
                for (int k = b; k >= a; k -= 2) {
                    System.out.print(k + " * " + j + " = " + (k * j));
                    if (k > a) {
                        System.out.print(" / ");
                    }
                }
                System.out.println();
            }
            break;
        }
    }
}