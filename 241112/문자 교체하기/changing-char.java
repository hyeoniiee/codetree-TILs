import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        String prefix = firstString.substring(0, 2);

        String modifiedString = prefix + secondString.substring(2);

        System.out.println(modifiedString);
    }
}