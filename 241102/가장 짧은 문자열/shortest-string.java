import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int maxLength = Math.max(len1, Math.max(len2, len3));
        int minLength = Math.min(len1, Math.min(len2, len3));

        int difference = maxLength - minLength;
        System.out.println(difference);
    }
}