package algorithm.basic;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(" main " +  i);
            if(i == 50){
                thread.join();
            }
        }
    }
}
