package step3;

import java.io.*;

public class Solution25314 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        int count = i / 4;

        for (int j = 0; j < count; j++) {
            bw.write("long ");
        }

        bw.write("int");
        bw.flush();
        bw.close();




    }
}
