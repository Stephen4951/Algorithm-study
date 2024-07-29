package step5;

import java.io.*;

public class Solution9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String word = br.readLine();
            System.out.println(word.charAt(0) + word.substring(word.length()-1));
        }

        br.close();

    }
}
