import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[100];
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            numbers[count] = num;
            if (num == 0) {
                break;
            }
            count++;
        }

        int sum = 0;
        if (count >= 3) {
            sum = numbers[count - 1] + numbers[count - 2] + numbers[count - 3];
        } else if (count == 2) {
            sum = numbers[count - 1] + numbers[count - 2];
        } else if (count == 1) {
            sum = numbers[count - 1];
        }

        System.out.println(sum);
    }
}