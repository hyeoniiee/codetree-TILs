import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("ice");
        } else if (0 > a || a < 100) {
            System.out.println("water");
        } else {
            System.out.println("vapor");
        }
    }
}