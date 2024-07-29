package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");
        for (String s : arr) {
            if (Integer.parseInt(s) < X) System.out.print(s + " ");
         }

        br.close();

    }
}
