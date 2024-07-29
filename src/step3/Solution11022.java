package step3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution11022 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            int result = i1 + i2;
            bw.write("Case #" + i + ": " + i1 + " + " + i2 + " = " + result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
