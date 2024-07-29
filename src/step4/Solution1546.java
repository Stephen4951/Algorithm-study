package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] scoreArr = new double[subNum];

        for (int i = 0; i < subNum; i++) {
            scoreArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scoreArr);
        double max = scoreArr[scoreArr.length-1];


        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = (double) scoreArr[i] / max * 100;
        }

        double total = 0;
        for (double d : scoreArr) {
            total += d;
        }
        System.out.println(total / subNum);

        br.close();


    }
}
