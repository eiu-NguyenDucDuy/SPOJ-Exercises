package Lab2;

import java.io.*;
import java.util.*;

class EIUMADIS {// Find the maximum difference
    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();

        long[] array = new long[n];
        for (var i = 0; i < array.length; i++)
            array[i] = reader.nextLong();

        long result = maxDifference(array);
        System.out.println(result);
    }

    public static long maxDifference(long[] array) {
        long minValue = array[0];
        long maxDiff = 0;

        for (var i = 1; i < array.length; i++) {
            maxDiff = Math.max(maxDiff, array[i] - minValue);
            minValue = Math.min(minValue, array[i]);
        }

        return maxDiff;
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