package com.smakslow.juc.chart2;
/*finalize的执行过程(生命周期)
(1) 首先，大致描述一下finalize流程：当对象变成(GC Roots)不可达时，GC会判断该对象是否覆盖了finalize方法，若未覆盖，
则直接将其回收。否则，若对象未执行过finalize方法，将其放入F-Queue队列，由一低优先级线程执行该队列中对象的finalize方法。
执行finalize方法完毕后，GC会再次判断该对象是否可达，若不可达，则进行回收，否则，对象“复活”。
(2) 具体的finalize流程：
对象可由两种状态，涉及到两类状态空间，一是终结状态空间 F = {unfinalized, finalizable, finalized}；
二是可达状态空间 R = {reachable, finalizer-reachable, unreachable}。各状态含义如下：
unfinalized: 新建对象会先进入此状态，GC并未准备执行其finalize方法，因为该对象是可达的
finalizable: 表示GC可对该对象执行finalize方法，GC已检测到该对象不可达。正如前面所述，GC通过F-Queue队列和一专用线程完成finalize的执行
finalized: 表示GC已经对该对象执行过finalize方法
reachable: 表示GC Roots引用可达
finalizer-reachable(f-reachable)：表示不是reachable，但可通过某个finalizable对象可达
unreachable：对象不可通过上面两种途径可达*/
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
