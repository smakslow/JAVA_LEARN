package algorithm.basic;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String args[]) {
        int i = 0;
        i = i++ + i;
        System.out.println("I = " + i);
        HashMap<Integer,Integer> map= new HashMap<>();
        BigInteger a = new BigInteger("31413413");
        BigInteger b = new BigInteger("213125125135315");
        System.out.println(a.add(b));
        System.out.println("Integer.bitCount(22) = " + Integer.bitCount(22));
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
    }

}
