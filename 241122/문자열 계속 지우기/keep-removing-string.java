import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        
        while (a.contains(b)) {
            int index = a.indexOf(b);
            a = a.substring(0, index) + a.substring(index + b.length());
        }
        
        System.out.println(a);
    }
}