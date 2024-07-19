import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (isMan(br.readLine()) || isMan(br.readLine())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isMan(String person) {
        String[] info = person.split(" ");
        return 19 <= Integer.parseInt(info[0]) && info[1].equals("M");
    }
}