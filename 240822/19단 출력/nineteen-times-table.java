public class Main {
    public static void main(String[] args) {
        int n = 19;

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                System.out.print(i + " * " + j + " = " + (i * j));
                if (j % 2 == 0) { 
                    System.out.println(); 
                } else if (j != n) {
                    System.out.print(" / "); 
                }
            }
            if (n % 2 != 0) {
                System.out.println(); 
            }
        }
    }
}