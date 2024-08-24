import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] >= 250) {
                break;
            }
            sum += numbers[i];
            count++;
        }

        if (count == 0) {
            for (int i = 0; i < 10; i++) {
                sum += numbers[i];
            }
            count = 10;
        }

        double average = (double) sum / count;

        System.out.printf("%d %.1f", sum, average);
    }
}