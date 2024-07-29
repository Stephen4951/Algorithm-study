package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution10810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int value = Integer.parseInt(st2.nextToken());
            for (int j = start-1; j < end; j++) {
                arr[j] = value;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        br.close();
    }
}
