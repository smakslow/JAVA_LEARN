package com.smakslow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        char[] str1 = str.toCharArray();
        char[] subStr1 = subStr.toCharArray();
        System.out.println(compare(str1, subStr1));
    }

    public static int compare(char[] str, char[] subStr) {
        int count = 1;
        int i = 1, j = 1;
        if (str[0] != subStr[0] || str == null || subStr == null) {
            return -1;
        } else {
            if (subStr[j] != '\0') {
                if (str[i] == subStr[j]) {
                    count++;
                    i++;
                    j++;
                } else if (subStr[j] == '?') {
                    if (subStr[j + 1] == str[i + 1]) {
                        i++;
                        count++;
                    } else if (subStr[j + 1] == str[i + 2]) {
                        i += 2;
                        count += 2;
                    } else if (subStr[j + 1] == str[i + 3]) {
                        i += 3;
                        count += 3;
                    } else {
                        return -1;
                    }
                    j++;
                } else if (str[i] != subStr[i]) {
                    return -1;
                }
            }
        }
        return count;
    }

}
