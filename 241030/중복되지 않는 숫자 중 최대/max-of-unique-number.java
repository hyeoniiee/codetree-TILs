import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxUnique = -1; 

        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1 && num > maxUnique) {
                maxUnique = num;
            }
        }

        System.out.println(maxUnique);

    }
}