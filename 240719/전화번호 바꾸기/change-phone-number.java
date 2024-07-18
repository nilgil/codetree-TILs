import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phone = br.readLine();
        String[] numbers = phone.split("-");
        System.out.printf("%s-%s-%s", numbers[0], numbers[2], numbers[1]);
    }
}