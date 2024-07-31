package step7;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[M];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st2.nextToken());
            }
            A[i] = arr;
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[M];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st2.nextToken());
            }
            B[i] = arr;
        }

        for (int i = 0; i < N; i++) {
            int[] temp = new int[M];
            for (int j = 0; j < M; j++) {
                temp[j] = A[i][j] + B[i][j];
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            result[i] = temp;
            System.out.println();
        }

        br.close();

    }
}
