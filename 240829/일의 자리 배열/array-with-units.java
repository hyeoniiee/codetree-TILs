import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        
        int[] sequence = new int[10];
        sequence[0] = first;
        sequence[1] = second;
        
        for (int i = 2; i < 10; i++) {
            sequence[i] = (sequence[i - 2] + sequence[i - 1]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}