package com.smakslow.juc.chart2;
/*finalize��ִ�й���(��������)
(1) ���ȣ���������һ��finalize���̣���������(GC Roots)���ɴ�ʱ��GC���жϸö����Ƿ񸲸���finalize��������δ���ǣ�
��ֱ�ӽ�����ա�����������δִ�й�finalize�������������F-Queue���У���һ�����ȼ��߳�ִ�иö����ж����finalize������
ִ��finalize������Ϻ�GC���ٴ��жϸö����Ƿ�ɴ�����ɴ����л��գ����򣬶��󡰸����
(2) �����finalize���̣�
�����������״̬���漰������״̬�ռ䣬һ���ս�״̬�ռ� F = {unfinalized, finalizable, finalized}��
���ǿɴ�״̬�ռ� R = {reachable, finalizer-reachable, unreachable}����״̬�������£�
unfinalized: �½�������Ƚ����״̬��GC��δ׼��ִ����finalize��������Ϊ�ö����ǿɴ��
finalizable: ��ʾGC�ɶԸö���ִ��finalize������GC�Ѽ�⵽�ö��󲻿ɴ����ǰ��������GCͨ��F-Queue���к�һר���߳����finalize��ִ��
finalized: ��ʾGC�Ѿ��Ըö���ִ�й�finalize����
reachable: ��ʾGC Roots���ÿɴ�
finalizer-reachable(f-reachable)����ʾ����reachable������ͨ��ĳ��finalizable����ɴ�
unreachable�����󲻿�ͨ����������;���ɴ�*/
class User{
    public static User user = null;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("User-->finalize()");
        user = this;
    }

}

public class FinalizerTest {
    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        user = null;
        System.gc();
        Thread.sleep(1000);

        user = User.user;
        System.out.println(user != null);//true

        user = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(user != null);//false
    }
}
