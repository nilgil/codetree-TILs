import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (3000 <= n) {
            System.out.println("book");
        } else if (1000 <= n) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}