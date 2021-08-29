package com.smakslow.juc.chart3;

import java.util.concurrent.*;

public class ExectorsTest {
    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "hello";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<String> future = executorService.submit(task);
        String s = future.get();
        future.cancel(true);
        System.out.println(s);


        FutureTask<String> futureTask = new FutureTask<>(new Task());
        executorService.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
