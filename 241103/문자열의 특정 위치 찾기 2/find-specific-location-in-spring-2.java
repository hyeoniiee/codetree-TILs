import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};

        char targetChar = scanner.next().charAt(0);

        int count = 0; 

        for (String word : words) {
            if ((word.length() >= 3 && word.charAt(2) == targetChar) || 
                (word.length() >= 4 && word.charAt(3) == targetChar)) {
                System.out.println(word);
                count++;
            }
        }

        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }

    }
}