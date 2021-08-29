package com.smakslow.javapractice.test;
import java.io.*;


public class IOTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String s = br.readLine();
            for (int i = s.length() - 1; i >= 0; i--)
                bw.append(s.charAt(i));
            bw.flush();
        } catch (IOException e) {}
    }
}
