import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int countEe = 0;
        int countEb = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            String substring = input.substring(i, i + 2);
            if (substring.equals("ee")) {
                countEe++;
            } else if (substring.equals("eb")) {
                countEb++;
            }
        }

        System.out.println(countEe + " " + countEb);
    }
}