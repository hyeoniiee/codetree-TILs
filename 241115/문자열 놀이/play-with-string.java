import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder(scanner.next());
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int a = scanner.nextInt() - 1;
                int b = scanner.nextInt() - 1;
                
                char temp = s.charAt(a);
                s.setCharAt(a, s.charAt(b));
                s.setCharAt(b, temp);

                System.out.println(s);
            } else if (queryType == 2) {
                char a = scanner.next().charAt(0);
                char b = scanner.next().charAt(0);
                
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == a) {
                        s.setCharAt(j, b);
                    }
                }

                System.out.println(s);
            }
        }
    }
}
