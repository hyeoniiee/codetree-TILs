import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) { 
                evenNumbers.add(number);
            }
        }

        for (int i = evenNumbers.size() - 1; i >= 0; i--) {
            System.out.print(evenNumbers.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}