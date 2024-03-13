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
        }

        int r1 = 1 + (n - 1);
        int r2 = line - (n - 1);

        if (line % 2 == 0) {
            System.out.println(r1 + "/" + r2);
        } else {
            System.out.println(r2 + "/" + r1);
        }

    }
}
