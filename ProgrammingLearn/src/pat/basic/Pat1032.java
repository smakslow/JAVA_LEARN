package pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Pat1032 {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int num = Reader.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int schId = 0, score = 0;
        for (int i = 0; i < num; i++) {
            schId = Reader.nextInt();
            score = Reader.nextInt();
            map.put(schId, map.getOrDefault(schId, 0) + score);
        }
        Reader.close();
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                schId = entry.getKey();
            }
        }
        System.out.println(schId + " " + max);
    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static void close() throws IOException {
        reader.close();
    }
}
