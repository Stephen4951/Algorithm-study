package step3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution11021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
