package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution10813 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int index = Integer.parseInt(st2.nextToken()) - 1;
            int index2 = Integer.parseInt(st2.nextToken()) - 1;
            int temp = arr[index];
            arr[index] = arr[index2];
            arr[index2] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        br.close();
    }
}
