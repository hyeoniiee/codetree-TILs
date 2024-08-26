import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCount = sc.nextInt();
        int passCount = 0;

        for (int i = 0; i < studentCount; i++) {
            int totalScore = 0;

            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                totalScore += score;
            }

            double average = totalScore / 4.0;

            if (average >= 60) {
                System.out.println("pass");
                passCount++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(passCount);
    }
}