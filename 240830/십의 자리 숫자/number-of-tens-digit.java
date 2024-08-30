import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[10];

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num >= 10) {
                int tens = num / 10;
                count[tens]++;
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}