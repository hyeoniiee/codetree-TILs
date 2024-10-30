import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while (true) {
            int num = scanner.nextInt(); 
            
            if (num == 999 || num == -999) {
                break;
            }
            
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println(max + " " + min);
        
    }
}