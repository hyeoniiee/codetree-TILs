import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if ((i + 1) % 2 == 1) {
                oddSum += num;
            } else {
                evenSum += num;
            }
        }

        int result = Math.abs(oddSum - evenSum);
        System.out.println(result);
    }
}