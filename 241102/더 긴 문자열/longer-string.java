import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " " + word1.length());
        } else if (word2.length() > word1.length()) {
            System.out.println(word2 + " " + word2.length());
        } else {
            System.out.println("same");
        }
    }
}