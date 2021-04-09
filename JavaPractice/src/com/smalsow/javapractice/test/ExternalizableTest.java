package com.smalsow.javapractice.test;

import java.io.*;

/**
 * @author stark_h
 */
public class ExternalizableTest implements Externalizable{
    private transient String content = "哈哈~我将会被序列化，不管我是是否被transient关键字修饰";

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(content);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {
        content = (String) in.readObject();
    }

    public static void main(String[] args) throws Exception {
        ExternalizableTest et = new ExternalizableTest();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                new File("ext0000")));
        out.writeObject(et);

        ObjectInput in = new ObjectInputStream(new FileInputStream(new File(
                "ext0000")));
        ExternalizableTest et1 = (ExternalizableTest) in.readObject();
        System.out.println(et1.content);

        out.close();
        in.close();
    }
}
