import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 첫 번째 조건: a가 b보다 같거나 큰가?
        if (a >= b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        // 두 번째 조건: a가 b보다 큰가?
        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        // 세 번째 조건: b가 a보다 같거나 큰가?
        if (b >= a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        // 네 번째 조건: b가 a보다 큰가?
        if (b > a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        // 다섯 번째 조건: a와 b가 같은가?
        if (a == b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        // 여섯 번째 조건: a와 b가 다른가?
        if (a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}