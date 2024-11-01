import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine(); 
        String str2 = scanner.nextLine(); 

        int totalLength = str1.length() + str2.length(); 
        System.out.println(totalLength); 
    }
}