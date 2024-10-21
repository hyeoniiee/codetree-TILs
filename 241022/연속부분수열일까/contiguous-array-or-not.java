import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = scanner.nextInt();
        }
        
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = scanner.nextInt();
        }
        
        boolean isSubsequence = false;
        
        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isSubsequence = true;
                break;
            }
        }
        
        if (isSubsequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}