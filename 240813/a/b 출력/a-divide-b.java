import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 정수부 계산 및 출력
        System.out.print(a / b + ".");

        // 나머지 계산
        a = a % b;

        // 소수부 계산
        for (int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a / b);
            a = a % b;
        }

    }
}