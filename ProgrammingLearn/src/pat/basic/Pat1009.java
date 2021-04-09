package pat.basic;

import java.util.Scanner;

public class Pat1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.close();
        String[] strings = str.split("");
        int len = strings.length;
        for (int i = len-1; i  > 0; i--) {
            System.out.print(strings[i]);
        }
    }
}
