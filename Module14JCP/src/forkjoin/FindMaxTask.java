/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2014
 */
class FindMaxTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start, end;

    public FindMaxTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread() + ": Start: " + start + ", End: " + end);
        if (end - start <= 7) {
            // number of elements is at or below the threshold - compute directly
            return computeDirectly();
        } else {
            // number of elements is above the threshold - split into subtasks
            int mid = start + (end - start) / 2;
            FindMaxTask left = new FindMaxTask(arr, start, mid);
            FindMaxTask right = new FindMaxTask(arr, mid, end);

            // invoke the tasks in parallel and wait for them to complete
            invokeAll(left, right);
            System.out.println(left.join() + "-" + right.join());
            // maximum of overall range is maximum of sub-ranges
            return Math.max(left.join(), right.join());
        }
    }

    private Integer computeDirectly() {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        ForkJoinPool pool = new ForkJoinPool();
        FindMaxTask rootTask = new FindMaxTask(data, 0, data.length);
        Integer result = pool.invoke(rootTask);

        System.out.println("Max is " + result);
    }
}
