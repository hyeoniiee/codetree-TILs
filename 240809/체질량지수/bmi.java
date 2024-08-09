import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 키(cm)와 몸무게(kg) 입력받기
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // BMI 계산
        double bmi = w / Math.pow(h / 100.0, 2);
        
        // BMI를 소수점 첫째 자리에서 버림하여 정수로 출력
        int bmiInt = (int) bmi;
        System.out.println(bmiInt);
        
        // BMI가 25 이상이면 비만(Obesity) 출력
        if (bmiInt >= 25) {
            System.out.println("Obesity");
        }
    }
}