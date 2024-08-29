import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenNumbers.add(arr[i]);
            }
        }

        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}