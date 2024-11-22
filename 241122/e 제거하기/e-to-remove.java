import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        int index = input.indexOf('e');
        
        String result = input.substring(0, index) + input.substring(index + 1);
        
        System.out.println(result);
    }
}