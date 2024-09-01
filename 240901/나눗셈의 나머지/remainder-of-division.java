import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] remainderCount = new int[b];
        
        while (a > 1) {
            int remainder = a % b;
            remainderCount[remainder]++;
            a /= b;
        }
        
        int result = 0;
        for (int count : remainderCount) {
            result += count * count; 
        }
        
        System.out.println(result);
    }
}