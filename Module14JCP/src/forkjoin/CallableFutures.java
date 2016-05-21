/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Humberto Banuelos
 */
public class CallableFutures {

    private static final int NTHREDS = 4;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        List<Future<Long>> list = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            Callable<Long> worker = new MyCallable();
            Future<Long> submit = executor.submit(worker);
            list.add(submit);
        }
        long sum = 0;
        //System.out.println(list.size());
        // Now retrieve the result
        for (Future<Long> future : list) {
            try {
                sum += future.get();
                //future.isDone();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
        executor.shutdown();
    }
}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {

        long sum = 0;

        for (long i = 0; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}
