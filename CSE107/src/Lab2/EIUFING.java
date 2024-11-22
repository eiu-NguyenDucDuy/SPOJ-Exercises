package Lab2;

import java.io.*;
import java.util.*;

class EIUFING {
    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        String[] fingers = new String[] { "cai", "tro", "giua", "ap ut", "ut", "ut", "ap ut", "giua", "tro", "cai" };
        int number = reader.nextInt();

        number %= 18;
        if (number > 19)
            number %= 18;
        if (number > 10)
            number = 20 - number;

        System.out.println("Ngon " + fingers[number - 1] + " cua ban tay " + ((number > 5) ? "phai" : "trai"));
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