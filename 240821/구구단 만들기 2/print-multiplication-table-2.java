import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] multiples = {2, 4, 6, 8};

        for (int i = 0; i < multiples.length; i++) {
            for (int j = b; j >= a; j--) {
                System.out.print(j + " * " + multiples[i] + " = " + (j * multiples[i]));
                if (j > a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}