import java.util.*;
import java.io.*;

public class Main {
    public static void main(String argc[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = "";
        int count = 0;

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            count += checker(s);
        }

        System.out.println(count);
    }

    public static int checker(String s) {
        ArrayList<Character> check = new ArrayList<Character>();
        check.add(s.charAt(0));

        char[] origin = s.toCharArray();
        int flag = 0;

        for (int i = 1; i < s.length(); i++) {
            if (origin[i - 1] != origin[i] && check.contains(origin[i]))
                return 0;
            else if (origin[i - 1] != origin[i] && !check.contains(origin[i]))
                check.add(origin[i]);
        }

        return 1;
    }

    public static int checker2(String s) {
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else
                    return 0;
            } else {
                continue;
            }
        }
        return 1;
    }
}
