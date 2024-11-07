import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        scanner.close();
        
        String[] words = input.split(" "); 
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]); 
        }
    }
}