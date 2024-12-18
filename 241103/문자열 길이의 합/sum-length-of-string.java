import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        sc.nextLine();

        int totalLength = 0;
        int aCount = 0;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            totalLength += input.length();

            if (!input.isEmpty() && input.charAt(0) == 'a') {
                aCount++;
            }
        }

        System.out.println(totalLength + " " + aCount);

    }
}