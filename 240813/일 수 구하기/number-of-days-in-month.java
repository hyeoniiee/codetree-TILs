import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (y == 1 || y == 3 || y == 5 || y == 7 ||
            y == 8 || y == 10 || y == 12) {
            System.out.println(31);
        } else if (y == 4 || y == 6 || y == 9 || y == 11) {
            System.out.println(30);
        } else if (y == 2) {
            System.out.println(28);
        } 
    }
}