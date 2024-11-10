import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder modified = new StringBuilder(input);
        modified.setCharAt(1, 'a'); 
        modified.setCharAt(input.length() - 2, 'a'); 

        System.out.println(modified.toString());

    }
}