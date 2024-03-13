import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String argc[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 2; i < s.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder sb1 = new StringBuilder(s.substring(0, j));
                StringBuilder sb2 = new StringBuilder(s.substring(j, i));
                StringBuilder sb3 = new StringBuilder(s.substring(i));

                String rv1 = sb1.reverse().toString();
                String rv2 = sb2.reverse().toString();
                String rv3 = sb3.reverse().toString();

                list.add(rv1 + rv2 + rv3);
            }
        }
        Collections.sort(list);
        System.out.println(list.getFirst());
    }
}
