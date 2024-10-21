import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;
        int result = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                count++;
                if (count == 3) {
                    result = i + 1; 
                    break;
                }
            }
        }
        
        System.out.println(result);
    
    }
}