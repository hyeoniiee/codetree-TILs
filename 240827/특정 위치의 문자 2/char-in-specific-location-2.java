import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars = new String[10];

        for (int i = 0; i < 10; i++) {
            chars[i] = sc.next();
        }

        System.out.println(chars[1] + " " + chars[4] + " " + chars[7]);
    }
}