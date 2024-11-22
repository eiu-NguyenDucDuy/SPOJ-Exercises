package Lab2;

import java.io.*;
import java.util.*;

class EIDISCOU {// DISCOUNT
    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        double M = 1000000;
        double[] levels = new double[] { 500 * M, 200 * M, 100 * M, 50 * M, 10 * M, 2 * M, 1000 };
        double[] rates = new double[] { .15, .12, .10, .07, .05, .03, .0 };

        double money = reader.nextDouble();

        double remaining = money;
        double discount = 0.0;
        for (var i = 0; i < levels.length; i++) {
            if (remaining > levels[i]) {
                discount += (remaining - levels[i]) * rates[i];
                remaining = levels[i];
            }
        }

        long payment = (long) (money - discount);
        
        System.out.println(payment);
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