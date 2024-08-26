import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = numbers[2] + numbers[4] + numbers[9];

        System.out.println(sum);
    }
}