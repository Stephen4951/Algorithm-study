package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        int i = Integer.parseInt(new StringBuilder(s1).reverse().toString());
        int j = Integer.parseInt(new StringBuilder(s2).reverse().toString());

        if (i > j) System.out.println(i);
        else System.out.println(j);

        br.close();

    }
}
