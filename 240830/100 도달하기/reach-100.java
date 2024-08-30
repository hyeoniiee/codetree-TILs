import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 1;
        int second = n;

        System.out.print(first + " " + second + " ");

        while (true) {
            int next = first + second; 

            System.out.print(next + " ");

            if (next > 100) break;

            first = second;
            second = next;
        }
    }
}