import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = A.indexOf(B, index)) != -1) {
            count++;
            index++; 
        }
        System.out.println(count);

    }
}