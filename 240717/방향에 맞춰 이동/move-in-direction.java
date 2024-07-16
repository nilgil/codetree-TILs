import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = 0, y = 0;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String way = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());

            switch (way) {
                case "N":
                    y += distance;
                    break;
                case "S":
                    y -= distance;
                    break;
                case "E":
                    x += distance;
                    break;
                case "W":
                    x -= distance;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}