import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break; 
            }
            sum += num;
            count++;
        }

        double average = (count > 0) ? (double) sum / count : 0.0;

        System.out.printf("%d %.1f", sum, average);
    }
}