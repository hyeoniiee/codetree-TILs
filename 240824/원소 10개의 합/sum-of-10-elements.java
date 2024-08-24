import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int val = sc.nextInt();
            sum += val;
        }
        System.out.print(sum);
    }
}