package com.smakslow.juc.chart1;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Pipe {
    static class ReaderThread implements Runnable {
        private PipedReader reader;

        public ReaderThread(PipedReader reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            System.out.println("this is reader");
            int receive;
            try {
                while ((receive = reader.read()) != -1) {
                    System.out.print((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class WriterThread implements Runnable {
        private PipedWriter writer;

        public WriterThread(PipedWriter writer) {
            this.writer = writer;
        }

        @Override
        public void run() {
            System.out.println("this is writer");
            int receive = 0;
            try {
                writer.write("test");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*����ͨ���̵߳Ĺ��캯������?�� PipedWrite �� PipedReader ���󡣿��Լ򵥷���
    ?�����ʾ�������ִ?���̣�
    1. �߳�ReaderThread��ʼִ?��
    2. �߳�ReaderThreadʹ?�ܵ�reader.read()��?����������
    3. �߳�WriterThread��ʼִ?��
    4. �߳�WriterThread?writer.write("test")���ܵ�д?�ַ�����
    5. �߳�WriterThreadʹ?writer.close()�����ܵ�д?����ִ?��ϣ�
    6. �߳�ReaderThread���ܵ��ܵ�������ַ�������ӡ��
    7. �߳�ReaderThreadִ?��ϡ�*/
    public static void main(String[] args) throws IOException, InterruptedException {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        writer.connect(reader); // ��?ע��?��Ҫ���ӣ�����ͨ��
        new Thread(new ReaderThread(reader)).start();
        Thread.sleep(10000);
        new Thread(new WriterThread(writer)).start();
    }
}
