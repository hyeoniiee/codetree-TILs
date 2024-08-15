import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start, end;
        if(a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}