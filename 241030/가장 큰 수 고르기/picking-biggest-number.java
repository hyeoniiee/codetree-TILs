import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println(max);
        
    }
}