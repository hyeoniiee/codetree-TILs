import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == m) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}