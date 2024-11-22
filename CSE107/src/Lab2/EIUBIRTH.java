package Lab2;

import java.io.*;
import java.util.*;

class EIUBIRTH {// Quà Sinh Nhật
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int testcases = reader.nextInt();

        while (testcases-- > 0) {
            long blueGifts = reader.nextLong();
            long redGifts = reader.nextLong();

            long bluePrice = reader.nextLong();
            long redPrice = reader.nextLong();
            long exchangePrice = reader.nextLong();

            long bluePrices = Math.min(blueGifts * bluePrice, blueGifts * (redPrice + exchangePrice));
            long redPrices = Math.min(redGifts * redPrice, redGifts * (bluePrice + exchangePrice));
            long money = bluePrices + redPrices;

            sb.append(money).append("\n");
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