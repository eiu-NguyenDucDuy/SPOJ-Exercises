package Lab1;

import java.io.*;
import java.util.*;

class EIUTRIGLE {// Number of triangles

    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        int N = reader.nextInt();
        int[] values = new int[N];

        for (var i = 0; i < values.length; i++)
            values[i] = reader.nextInt();

        Arrays.sort(values);

        int triangles = 0;
        for (var i = 0; i < values.length; i++)
            for (var j = i + 1; j < values.length; j++)
                for (var k = j + 1; k < values.length; k++)
                    if ((values[i] + values[j]) > values[k])
                        triangles++;

        System.out.println(triangles);
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