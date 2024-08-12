import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int school = 0;

        if (a >= 90) {
            if (b >= 95) {
                school = 100000;
            } else if (b >= 90) {
                school = 50000;
            }
        }
        System.out.println(school);

    }
}