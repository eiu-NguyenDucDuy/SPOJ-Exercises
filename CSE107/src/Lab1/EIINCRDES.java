package Lab1;

import java.io.*;
import java.util.*;

class EIINCRDES {// Order of the sequence

    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        int n = reader.nextInt();
        int[] array = new int[n];

        for (var i = 0; i < array.length; i++)
            array[i] = reader.nextInt();

        if (isIncreasing(array))
            System.out.println("increasing");
        else {
            if (isDecreasing(array))
                System.out.println("decreasing");
            else
                System.out.println("none");
        }
    }

    public static boolean isIncreasing(int[] array) {
        for (var i = 1; i < array.length; i++)
            if (array[i] <= array[i - 1])
                return false;
        return true;
    }

    public static boolean isDecreasing(int[] array) {
        for (var i = 1; i < array.length; i++)
            if (array[i] >= array[i - 1])
                return false;
        return true;
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