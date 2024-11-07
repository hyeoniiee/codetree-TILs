import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = scanner.nextLine();
        }
        
        String endChar = scanner.nextLine();
        
        boolean found = false;
        for (String word : words) {
            if (word.endsWith(endChar)) {
                System.out.println(word);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("None");
        }
    }
}