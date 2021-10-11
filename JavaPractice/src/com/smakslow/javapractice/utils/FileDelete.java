package com.smakslow.javapractice.utils;

import java.io.File;

public class FileDelete {
    static String newString = "";//新字符串,如果是去掉前缀后缀就留空，否则写上需要替换的字符串
    static String oldString = "pdf";//要被替换的字符串
    static String dir = "C:\\Users\\51484\\Desktop\\极客时间";//文件所在路径，所有文件的根目录，记得修改为你电脑上的文件所在路径

    public static void main(String[] args){
        recursiveTraversalFolder(dir);//递归遍历此路径下所有文件夹
    }

    /**
     * 递归遍历文件夹获取文件
     */
    public static void recursiveTraversalFolder(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            File[] fileArr = folder.listFiles();
            if (null == fileArr || fileArr.length == 0) {
                System.out.println("文件夹是空的!");
            } else {
                String fileName;//旧文件名
                for (File file : fileArr) {
                    if (file.isDirectory()) {//是文件夹，继续递归，如果需要重命名文件夹，这里可以做处理
                        System.out.println("文件夹:" + file.getAbsolutePath() + "，继续递归！");
                        recursiveTraversalFolder(file.getAbsolutePath());
                    } else {//是文件，判断是否需要重命名
                        fileName = file.getName();
                        if (!fileName.endsWith(oldString)) {//文件名包含需要被替换的字符串
                            file.delete();
                            System.out.println("delete：" + fileName);
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }
}
