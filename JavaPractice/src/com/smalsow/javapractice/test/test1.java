package com.smalsow.javapractice.test;

import java.io.File;

public class test1 {
    public static void main(String[] args) {
        String path = "D:\\learn\\git\\ActiveMQ";
        File[] hiddenFiles = new File(path).listFiles(File :: isHidden);
        for (File hiddenFile : hiddenFiles) {
            System.out.println(hiddenFile.getAbsolutePath());
        }
    }

}
