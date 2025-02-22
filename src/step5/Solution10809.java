package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        br.close();


    }
}
