package step1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        bw.write((i + j) + "\n");
        bw.write((i - j) + "\n");
        bw.write((i * j) + "\n");
        bw.write((i / j) + "\n");
        bw.write((i % j) + "\n");

        bw.flush();
        bw.close();
        br.close();


    }

}
