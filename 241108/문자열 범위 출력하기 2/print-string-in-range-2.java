import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        int count = scanner.nextInt();
        scanner.close();
        
        int length = input.length();
        
        String result;
        if (count <= length) {
            result = new StringBuilder(input.substring(length - count)).reverse().toString();
        } else {
            result = new StringBuilder(input).reverse().toString();
        }
        
        System.out.println(result);
    }
}