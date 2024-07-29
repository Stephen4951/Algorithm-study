package step3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        while ((str=br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            bw.write(i1 + i2 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
