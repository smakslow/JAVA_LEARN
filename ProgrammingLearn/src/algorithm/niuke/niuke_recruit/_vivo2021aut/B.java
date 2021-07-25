package algorithm.niuke.niuke_recruit._vivo2021aut;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        for (int i = 0; i < string.length(); i++) {
            String t = string.substring(0, i) + string.substring(i + 1);
            if (check(t)) {
                System.out.println(t);
                System.exit(0);
            }
        }
        System.out.println(false);
    }

    static boolean check(String s) {
        StringBuffer sb = new StringBuffer(s).reverse();
        return s.equals(sb.toString());
    }
}
