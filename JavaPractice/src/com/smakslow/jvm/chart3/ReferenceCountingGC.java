package com.smakslow.jvm.chart3;

public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bytes = new byte[_1MB >> 1];

    public static void main(String[] args) {
        ReferenceCountingGC A = new ReferenceCountingGC();
        ReferenceCountingGC B = new ReferenceCountingGC();
        A.instance = B;
        B.instance = A;

        A = null;
        B = null;
        System.out.println(Runtime.getRuntime().totalMemory() /_1MB);
        System.out.println(Runtime.getRuntime().maxMemory() / _1MB);
        System.gc();
    }
}
