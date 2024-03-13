import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int line = 1;

        while (n > line) {
            n -= line;
            line++;
            // System.out.println(n + "," + line);
        }

        int r1 = 1;
        int r2 = line;
        for (int i = 0; i < n - 1; i++) {
            r1++;
            r2--;
        }
        // System.out.println(r1 + "," + r2);

        if (line % 2 == 0) {
            System.out.println(r1 + "/" + r2);
        } else {
            System.out.println(r2 + "/" + r1);
        }
        br.readLine();

    }
}
