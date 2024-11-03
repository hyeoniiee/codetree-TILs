import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String result = line1.replace(" ", "") + line2.replace(" ", "");
        System.out.println(result);

    }
}