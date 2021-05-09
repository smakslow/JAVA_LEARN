package com.smalsow.jvm.chart3;

import java.util.ArrayList;

//-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
public class OutOfMemoryErrorTest {
    byte[] arr  = new byte[1024 << 1];

    public static void main(String[] args) {
        ArrayList<OutOfMemoryErrorTest> list = new ArrayList<>();
        int cnt = 0;
        try{
            while(true){
                list.add(new OutOfMemoryErrorTest());
                cnt++;
            }
        }catch ( Exception e){
            System.out.println(cnt);
            e.printStackTrace();
        }
    }
}
