package com.smakslow.javapractice.utils;

import java.io.File;
import java.io.IOException;

public class FileRename {
    static String newString = "";//���ַ���,�����ȥ��ǰ׺��׺�����գ�����д����Ҫ�滻���ַ���
    static String oldString = "�������̳ www.ruike1.com��";//Ҫ���滻���ַ���
    static String dir = "C:\\Users\\51484\\Desktop\\C\\DS\\���ݽṹ���㷨365��ˢ����ѵӪ";//�ļ�����·���������ļ��ĸ�Ŀ¼���ǵ��޸�Ϊ������ϵ��ļ�����·��

    public static void main(String[] args) throws IOException {
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
                return;
            } else {
                File newDir = null;//�ļ������ļ���·��+���ļ���
                String newName = "";//���ļ���
                String fileName = null;//���ļ���
                File parentPath = new File("");//�ļ����ڸ���·��
                for (File file : fileArr) {
                    if (file.isDirectory()) {//���ļ��У������ݹ飬�����Ҫ�������ļ��У��������������
                        System.out.println("�ļ���:" + file.getAbsolutePath() + "�������ݹ飡");
                        recursiveTraversalFolder(file.getAbsolutePath());
                    } else {//���ļ����ж��Ƿ���Ҫ������
                        fileName = file.getName();
                        parentPath = file.getParentFile();
                        if (fileName.contains(oldString)) {//�ļ���������Ҫ���滻���ַ���
                            newString = parentPath.getParentFile().getName();
                            newName = fileName.replaceAll(oldString, newString);//������
                            newDir = new File("I:\\�ڼ�������Ƶ" + "/" + newName);//�ļ������ļ���·��+���ļ���
                            file.renameTo(newDir);//������
                            System.out.println("�޸ĺ�" + newDir);
                        }
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
    }
}
