import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];

        int sum = 0;
        int mulSum = 0;
        int mulCount = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            
            if ((i + 1) % 2 == 0) {
                sum += arr[i];
            }

            if ((i + 1) % 3 == 0) {
                mulSum += arr[i];
                mulCount++;
            }
        }

        double avg = (double) mulSum / mulCount;
        System.out.printf("%d %.1f", sum, avg);
    }
}