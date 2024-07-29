package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Solution25304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        int account = 0;

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int result = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            account += result;
        }

        if (total != account) System.out.println("No");
        else System.out.println("Yes");





    }

}
