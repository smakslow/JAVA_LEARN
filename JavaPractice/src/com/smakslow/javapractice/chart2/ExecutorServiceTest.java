package com.smakslow.javapractice.chart2;

import org.junit.Test;

import java.awt.*;
import java.util.concurrent.*;

public class ExecutorServiceTest {

    @Test
    public void test() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> task = () -> Thread.currentThread().getName();
        Future<String> future = executorService.submit(task);
        System.out.println(future.get());

        Future<String> submit = executorService.submit(task);

        System.out.println(submit.get());
    }

    @Test
    public void test2(){
        Button button = new Button("send");

    }
}
