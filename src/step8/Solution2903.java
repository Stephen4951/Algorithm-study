package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 점 총 개수는 4, 9, 25, 81....
        // 한 변의 점 개수는 2, 3, 5, 9....
        // 점은 2^n-1 + 1 씩 증가한다.
        System.out.println((int)Math.pow((int)Math.pow(2, N) + 1, 2));

    }
}
