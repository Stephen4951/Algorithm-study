package step3;

import java.io.*;

public class Solution2439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            for (int k = count-1; k >= i ; k--) {
                bw.write(" ");
            }
            for (int j = 1; j <= i ; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
