package leetcode.daily;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class FizzBuzz{
        private int n;
        volatile int i = 1;
        public FizzBuzz(int n) {
            this.n = n;
        }
        Lock lock = new ReentrantLock();
        Condition conditionFizz = lock.newCondition();
        Condition conditionBuzz = lock.newCondition();
        Condition conditionFizzbuzz = lock.newCondition();
        Condition conditionNo = lock.newCondition();


        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            while (i <= n) {
                lock.lock();
                try {
                    while (i % 3 != 0 || i % 5 == 0) {
                        if (i > n ) {
                            return;
                        }
                        if (i % 5 == 0) {
                            conditionBuzz.signal();
                        }else  {
                            conditionFizz.signal();
                        }
                        conditionFizz.await();
                    }
                    if (i <= n) printFizz.run();
                    i ++;
                    conditionBuzz.signal();
                    conditionFizzbuzz.signal();
                    conditionNo.signal();
                }finally {
                    lock.unlock();;

                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            while (i <= n)  {
                lock.lock();
                try {
                    while (i % 5 != 0 || i % 3 == 0) {
                        if (i > n ) {
                            return;
                        }
                        if (i % 3 == 0) {
                            conditionFizz.signal();
                        } else {
                            conditionNo.signal();
                        }
                        conditionBuzz.await();
                    }
                    if (i <= n)  printBuzz.run();
                    i ++;
                    conditionFizz.signal();
                    conditionFizzbuzz.signal();
                    conditionNo.signal();
                }finally {
                    lock.unlock();;

                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            while (i <= n)  {
                lock.lock();
                try {
                    while (i % 3 != 0 || i % 5 != 0) {
                        if (i > n ) {
                            return;
                        }
                        conditionNo.signal();
                        conditionFizzbuzz.await();
                    }
                    if (i <= n) printFizzBuzz.run();
                    i ++;
                    conditionFizz.signal();
                    conditionBuzz.signal();
                    conditionNo.signal();
                }finally {
                    lock.unlock();
                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            while (i <= n)  {
                lock.lock();
                try {
                    while (i % 3 == 0 || i % 5 == 0) {
                        if (i % 3 == 0 && i % 5 ==0 ) {
                            conditionFizzbuzz.signal();
                        } else if (i % 3 == 0) {
                            conditionFizz.signal();
                        } else {
                            conditionBuzz.signal();
                        }
                        conditionNo.await();
                    }
                    if (i <= n) printNumber.accept(i);
                    i ++;
                    conditionFizz.signal();
                    conditionBuzz.signal();
                    conditionFizzbuzz.signal();
                }finally {
                    lock.unlock();;
                }
            }
        }
    }
