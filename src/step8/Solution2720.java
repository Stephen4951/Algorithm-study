package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / quarter).append(" ");
            c %= quarter;
            sb.append(c / dime).append(" ");
            c %= dime;
            sb.append(c / nickel).append(" ");
            c %= nickel;
            sb.append(c / penny).append("\n");
        }
        System.out.print(sb);

        br.close();
    }
}
