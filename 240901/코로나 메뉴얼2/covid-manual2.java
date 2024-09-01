import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0, B = 0, C = 0, D = 0;

        for (int i = 0; i < 3; i++) {
            String symptom = sc.next();
            int temp = sc.nextInt();

            if (symptom.equals("Y") && temp >= 37) {
                A++;
            } else if (symptom.equals("N") && temp >= 37) {
                B++;
            } else if (symptom.equals("Y") && temp < 37) {
                C++;
            } else if (symptom.equals("N") && temp < 37) {
                D++;
            }
        }

        System.out.print(A + " " + B + " " + C + " " + D);

        if (A >= 2) {
            System.out.print(" E");
        }

        System.out.println();
    }
}