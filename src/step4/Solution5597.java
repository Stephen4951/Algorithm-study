package step4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution5597 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++){
            int num = sc.nextInt();
            students[num-1] = 1;
        }

        for (int i = 0; i < 30; i++){
            if (students[i] == 0) System.out.println(i+1);
        }


    }
}
