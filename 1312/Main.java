import java.io.*;
import java.util.*;

public class Main {
    public static void main(String argc[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = (a % b) * 10;

        for (int i = 1; i < c; i++) {
            result %= b;
            result *= 10;
        }

        result /= b;

        System.out.println(result);
    }
}
