import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); 
        int[] multiples = new int[100]; 
        int count = 0; 

        for (int i = 1; ; i++) {
            multiples[i-1] = num * i;
            System.out.print(multiples[i-1] + " ");
            
            if (multiples[i-1] % 5 == 0) {
                count++;
            }
            
            if (count == 2) {
                break;
            }
        }
    }
}