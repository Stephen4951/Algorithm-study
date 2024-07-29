    package step1;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Solution11382 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str, " ");

            long l1 = Long.parseLong(st.nextToken());
            long l2 = Long.parseLong(st.nextToken());
            long l3 = Long.parseLong(st.nextToken());

            System.out.println(l1 + l2 + l3);

        }

    }
