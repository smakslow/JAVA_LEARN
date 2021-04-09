package pat.basic;

import java.util.Scanner;
public class Pat1011 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int i = 1;
        while(n-- >0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            System.out.println("Case #" + (i++) + ": " + (a + b > c ? "true" : "false"));
        }
        scanner.close();
    }
}
