import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();

            int area = width * height;
            System.out.println(area);

            if (c.equals("C")) {
                break;
            }
        }
    }
}