import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num >= 0 && num <= 200) {
                sum += num;
                count++;
            }
        }

        double avg = (double) sum / count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}