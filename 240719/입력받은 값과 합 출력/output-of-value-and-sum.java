public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split();
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.printf("%d %d %d", a, b, a + b);
    }
}