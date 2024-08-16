import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mul = true;

        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            if (number % 3 != 0) {
                mul = false;
                break;
            }
        }

        if (mul == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}