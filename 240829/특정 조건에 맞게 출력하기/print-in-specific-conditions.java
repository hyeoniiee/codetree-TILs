import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            numbers[count] = num;
            count++;
        }

        for (int i = 0; i < count; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] / 2 + " ");
            } else {
                System.out.print(numbers[i] + 3 + " ");
            }
        }
    }
}