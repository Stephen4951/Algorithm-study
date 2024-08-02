package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2745 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int total = 0;
        int cnt = 0;

        //1의자리부터 꺼꾸로 반복문 진행.
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);

            if (c >= '0' && c <= '9') {
                total += (int) ((c - '0') * Math.pow(B, cnt));
            } else {
                total += (int) ((c - 'A' + 10) * Math.pow(B, cnt));
            }
            cnt++;
        }

        System.out.println(total);

        br.close();


    }
}
