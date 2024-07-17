import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int leader = Integer.parseInt(st.nextToken());
        int crew = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < n; i++) {
            result++;
            counts[i] -= leader;

            if (0 < counts[i]) {
                result += counts[i] / crew;
                if (counts[i] % crew != 0) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}