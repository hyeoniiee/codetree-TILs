import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                count = 1; 
            } else if (numbers[i] == min) {
                count++;
            }
        }

        System.out.println(min + " " + count);

    }
}