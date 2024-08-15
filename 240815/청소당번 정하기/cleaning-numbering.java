import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int classroom = 0; // 교실 
        int hallway = 0; // 복도 
        int restroom = 0; // 화장실

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                restroom++;
            } else if (i % 3 == 0) {
                hallway++;
            } else if (i % 2 == 0) {
                classroom++;
            }
        }

        System.out.print(classroom + " " + hallway + " " + restroom);
    }
}