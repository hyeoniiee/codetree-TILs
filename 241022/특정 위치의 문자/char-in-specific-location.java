import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};

        Scanner scanner = new java.util.Scanner(System.in);
        char input = scanner.next().charAt(0);

        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("None");
        } else {
            System.out.println(index);
        }
    }
}