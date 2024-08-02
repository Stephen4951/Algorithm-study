package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int line = 1, total = 0;

        while (true) {
            if (X <= line + total) { // 입력받은 수가 총 칸의 개수보다 작은 경우
                if (line % 2 == 1) { // 홀수번째 라인인 경우
                    // 분모가 커지고 분자가 작아지는 패턴.
                    // 분모 -> 입력받은 값 - 직전 총 합
                    // 분자 -> 라인 번호 - 분모 + 1
                    int denominator = X - total;
                    int numerator = line - denominator + 1;
                    System.out.println(numerator + "/" + denominator);
                    break;
                } else { // 짝수번째 라인인 경우
                    // 분자가 커지고 분모가 작아지는 패턴. -> 홀수 반대로
                    int denominator = X - total;
                    int numerator = line - denominator + 1;
                    System.out.println(denominator + "/" + numerator);
                    break;
                }
            } else {
                total += line;
                line++;
            }

        }

        br.close();
    }
}
