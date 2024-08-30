import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= 10; i++) {
            int next = second + 2 * first;
            System.out.print(next + " ");
            
            first = second;
            second = next;
        }
    }
}