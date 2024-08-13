import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countA = 0;

        for (int i = 0; i < 3; i++) {
            String symptom = sc.next();
            double temperature = sc.nextDouble();

            if (symptom.equals("Y") && temperature >= 37.0) {
                countA++;
            }
        }

        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N"); 
        }
    }
}