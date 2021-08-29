package com.smakslow.juc.chart1;

public class Join {
    static class ThreadA implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("我是子线程，我先睡一秒");
                Thread.sleep(1000);
                System.out.println("我是子线程，我睡完了一秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*join()?法是Thread类的?个实例?法。它的作?是让当前线程陷?“等待”状态，等
        join的这个线程执?完成后，再继续执?当前线程。
        有时候，主线程创建并启动了?线程，如果?线程中需要进??量的耗时运算，主
        线程往往将早于?线程结束之前结束。
        如果主线程想等待?线程执?完毕后，获得?线程中的处理完的某个数据，就要?
        到join?法了*/

        Thread thread = new Thread(new ThreadA());
        thread.start();
        thread.join();
        System.out.println("如果不加join方法，我会先被打出来，加了就不一样了");

         /*sleep?法是不会释放当前的锁的，?wait?法会。这也是最
        常?的?个多线程?试题。
        它们还有这些区别：
        wait可以指定时间，也可以不指定；?sleep必须指定时间。
        wait释放cpu资源，同时释放锁；sleep释放cpu资源，但是不释放锁，所以易
        死锁。
        wait必须放在同步块或同步?法中，?sleep可以再任意位置*/
    }
}
