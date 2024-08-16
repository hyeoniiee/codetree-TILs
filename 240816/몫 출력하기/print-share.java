import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                int result = n / 2;
                System.out.println(result);
                count++;
            } 
        }
    }
}