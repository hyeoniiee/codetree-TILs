import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = (a <= b && a <= c) ? 1 : 0;
        System.out.print(min + " ");
        int all = (a == b && a == c) ? 1 : 0;
        System.out.print(all);
    }
}