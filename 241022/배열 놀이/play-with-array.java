import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            
            if (queryType == 1) {
                int a = scanner.nextInt();
                System.out.println(arr[a - 1]);
            } else if (queryType == 2) {
                int b = scanner.nextInt();
                int index = -1;
                
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        index = j + 1; 
                        break; 
                    }
                }
                
                if (index == -1) {
                    System.out.println(0); 
                } else {
                    System.out.println(index);
                }
            } else if (queryType == 3) {
                
                int s = scanner.nextInt();
                int e = scanner.nextInt();
                
                for (int j = s - 1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(); 
            }
        }

    }
}