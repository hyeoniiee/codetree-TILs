import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();
        char targetChar = sc.next().charAt(0);

        int position = inputString.indexOf(targetChar);

        if (position != -1) {
            System.out.println(position);
        } else {
            System.out.println("No");
        }
    }
}