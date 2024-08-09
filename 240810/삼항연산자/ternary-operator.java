import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        
        int grade = (score == 100) ? 0 : (score / 10) + 1;
        
        String result = (grade == 0) ? "pass" : "failure";
        System.out.println(result);
    }
}