package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Solution2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        // 1, 7, 19, 37, 61....
        // 6, 12, 18, 24씩 증가....
        if (N == 1) {
            System.out.print(1);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }

            System.out.print(count);
        }


    }
}
