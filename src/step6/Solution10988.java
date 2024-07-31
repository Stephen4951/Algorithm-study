package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution10988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = new StringBuilder(str).reverse();

        System.out.println("sb = " + sb);
        System.out.println("reverse = " + reverse);

        if (sb.toString().equals(reverse.toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        br.close();
    }
}
