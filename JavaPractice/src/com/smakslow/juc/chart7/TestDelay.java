package com.smakslow.juc.chart7;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class TestDelay {
    static class DelayedEle implements Delayed {
        private final long dalayTime;
        private final long expire;
        private String taskName;

        public DelayedEle(long delay, String taskName) {
            dalayTime = delay;
            this.expire = System.currentTimeMillis() + delay;
            this.taskName = taskName;
        }

        // £”‡ ±º‰
        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return "DelayedEle{" +
                    "dalayTime=" + dalayTime +
                    ", expire=" + expire +
                    ", taskName='" + taskName + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            DelayQueue<DelayedEle> delayedQueue = new DelayQueue<>();
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                DelayedEle delayedEle = new DelayedEle(random.nextInt(500), "task:" + i);
                delayedQueue.offer(delayedEle);
            }
            DelayedEle delayedEle = null;
            try {
                for (;;)
                while ((delayedEle = delayedQueue.take()) != null)
                {
                    System.out.println(delayedEle.toString());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
