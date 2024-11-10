import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String targetString = scanner.nextLine();

        int index = inputString.indexOf(targetString);

        System.out.println(index);

    }
}