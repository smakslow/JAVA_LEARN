package com.smakslow.javapractice.utils;

import java.io.File;

public class FileDelete {
    static String newString = "";//���ַ���,�����ȥ��ǰ׺��׺�����գ�����д����Ҫ�滻���ַ���
    static String oldString = "pdf";//Ҫ���滻���ַ���
    static String dir = "C:\\Users\\51484\\Desktop\\����ʱ��";//�ļ�����·���������ļ��ĸ�Ŀ¼���ǵ��޸�Ϊ������ϵ��ļ�����·��

    public static void main(String[] args){
        recursiveTraversalFolder(dir);//�ݹ������·���������ļ���
    }

    /**
     * �ݹ�����ļ��л�ȡ�ļ�
     */
    public static void recursiveTraversalFolder(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            File[] fileArr = folder.listFiles();
            if (null == fileArr || fileArr.length == 0) {
                System.out.println("�ļ����ǿյ�!");
            } else {
                String fileName;//���ļ���
                for (File file : fileArr) {
                    if (file.isDirectory()) {//���ļ��У������ݹ飬�����Ҫ�������ļ��У��������������
                        System.out.println("�ļ���:" + file.getAbsolutePath() + "�������ݹ飡");
                        recursiveTraversalFolder(file.getAbsolutePath());
                    } else {//���ļ����ж��Ƿ���Ҫ������
                        fileName = file.getName();
                        if (!fileName.endsWith(oldString)) {//�ļ���������Ҫ���滻���ַ���
                            file.delete();
                            System.out.println("delete��" + fileName);
                        }
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
    }
}
