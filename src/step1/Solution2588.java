package step1;

import javax.xml.transform.Source;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution2588 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        String B = in.next();

        in.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));




    }

}
