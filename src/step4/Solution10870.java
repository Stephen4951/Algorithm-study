package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution10870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String findNum = br.readLine();

        int result = 0;
        for (String s : arr) {
            if (s.equals(findNum)) result++;
        }

        System.out.println(result);

        br.close();

    }
}
