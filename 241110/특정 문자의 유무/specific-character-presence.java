import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean containsEe = input.contains("ee");
        boolean containsAb = input.contains("ab");

        System.out.print(containsEe ? "Yes " : "No ");
        System.out.print(containsAb ? "Yes" : "No");

    }
}