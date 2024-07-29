package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());

        int total = 0;

        for(int j = 1; j <= i; j++) {
            total += j;
        }

        System.out.println(total);


    }

}
