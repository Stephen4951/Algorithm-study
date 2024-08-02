package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 높이가 9인 나무, 3올라가고 1 떨어진다면 하루에 2씩 올라감 -> 4일
        // 시간이 타이트 하기 때문에 반복문 돌라면 안됨. 틀림.
        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) day++; // 남은 거리가 있다면 하루 더 소요됨

        System.out.println(day);


        br.close();
    }
}



















