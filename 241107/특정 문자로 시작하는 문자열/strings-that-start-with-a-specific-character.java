import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

        String conditionChar = scanner.nextLine();
        scanner.close();
        
        int count = 0;
        int totalLength = 0;
        
        for (String str : strings) {
            if (str.startsWith(conditionChar)) {
                count++;
                totalLength += str.length();
            }
        }
        
        double averageLength = (double) totalLength / count;
        
        System.out.printf("%d %.2f\n", count, averageLength);
    }
}