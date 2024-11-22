package Lab1;

import java.io.*;
import java.util.*;

class EIEVERYN {// Every Number
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int testcases = reader.nextInt();

        while (testcases-- > 0) {
            int m = reader.nextInt();
            int n = reader.nextInt();
            boolean[] flags = new boolean[n + 1];

            for (var i = 0; i < m; i++) {
                int value = reader.nextInt();

                if (1 <= value && value <= n)
                    flags[value] = true;
            }

            int count;
            for (count = 1; count <= n; count++)
                if (!flags[count])
                    break;

            sb.append(count == n + 1 ? "Yes" : "No").append("\n");
        }

        System.out.println(sb);
    }

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}