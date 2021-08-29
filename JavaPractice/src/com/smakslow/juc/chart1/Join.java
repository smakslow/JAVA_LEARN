package com.smakslow.juc.chart1;

public class Join {
    static class ThreadA implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("�������̣߳�����˯һ��");
                Thread.sleep(1000);
                System.out.println("�������̣߳���˯����һ��");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*join()?����Thread���?��ʵ��?����������?���õ�ǰ�߳���?���ȴ���״̬����
        join������߳�ִ?��ɺ��ټ���ִ?��ǰ�̡߳�
        ��ʱ�����̴߳�����������?�̣߳����?�߳�����Ҫ��??���ĺ�ʱ���㣬��
        �߳�����������?�߳̽���֮ǰ������
        ������߳���ȴ�?�߳�ִ?��Ϻ󣬻��?�߳��еĴ������ĳ�����ݣ���Ҫ?
        ��join?����*/

        Thread thread = new Thread(new ThreadA());
        thread.start();
        thread.join();
        System.out.println("�������join�������һ��ȱ�����������˾Ͳ�һ����");

         /*sleep?���ǲ����ͷŵ�ǰ�����ģ�?wait?���ᡣ��Ҳ����
        ��?��?�����߳�?���⡣
        ���ǻ�����Щ����
        wait����ָ��ʱ�䣬Ҳ���Բ�ָ����?sleep����ָ��ʱ�䡣
        wait�ͷ�cpu��Դ��ͬʱ�ͷ�����sleep�ͷ�cpu��Դ�����ǲ��ͷ�����������
        ������
        wait�������ͬ�����ͬ��?���У�?sleep����������λ��*/
    }
}
