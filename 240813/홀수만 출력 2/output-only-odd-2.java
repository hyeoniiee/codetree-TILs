import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        int temp;

        if (b > a) {
            temp = b;
            b = a;
            a = temp;
        }

        for (int i = a; i >= b; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}