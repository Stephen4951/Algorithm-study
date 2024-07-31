package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2563 {

    public static void main(String[] args) throws IOException {

        /*
        boolean 타입 이중 배열로 크기가 100, 100인 흰색 도화지를 만든다.
        색종이 갯수를 입력 받고 그 만큼 반복문을 돌려준다.
        반복문 안에서는 색종이와 벽에서의 x 거리와 y 거리를 입력받아주고 이중 for문을 생성한다.
        먼저 여기서 입력받은 x에서 색종이의 크기를 더한 x + 10까지 반복하고, y는 y + 10까지 반복하도록 하여
        boolean이 false인 것만 true로 바꿔준다.
        위 방식이 백지 도화지에 색종이를 붙이지만 겹치는 부분은 자동으로 배제가 된다는 느낌으로 쉽게 색종이 영역의 넓이를 구할 수 있다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int totalArea = 0;
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        totalArea++;
                    }
                }

            }
        }
        System.out.println(totalArea);


    }
}
