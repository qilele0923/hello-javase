package com.javase.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by qi on  2019-04-25 20:26
 */
public class BlockQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        offerTimePoll();
    }


    /**
     * 队列满时 2秒钟插不进去 放弃
     * 队列空时 2秒取不出来 返回空 不会阻塞
     * @throws InterruptedException
     */

    private static void offerTimePoll() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue<Integer>(3);
        System.out.println(queue.offer(1, 2l, TimeUnit.SECONDS));
        System.out.println(queue.offer(1, 2l, TimeUnit.SECONDS));
        System.out.println(queue.offer(1, 2l, TimeUnit.SECONDS));
        //   System.out.println(queue.offer(1, 2l, TimeUnit.SECONDS));
        System.out.println(queue.poll(2l, TimeUnit.SECONDS));
        System.out.println(queue.poll(2l, TimeUnit.SECONDS));
        System.out.println(queue.poll(2l, TimeUnit.SECONDS));
        System.out.println(queue.poll(2l, TimeUnit.SECONDS));
    }


    /**
     * 队列满时 阻塞
     * 队列为空 阻塞
     *
     * @param queue
     * @throws InterruptedException
     */
    private static void put_take(ArrayBlockingQueue queue) throws InterruptedException {
        queue.put(2);
        queue.put(2);
        queue.put(2);
        //  queue.put(2);
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());
    }


    /**
     * 插入成功 true 失败false
     * 移除队列方法 队列为空 返回 null
     *
     * @param queue
     */
    private static void offerNoParam(ArrayBlockingQueue queue) {
        System.out.println(queue.offer(1));
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(3));
        // System.out.println(queue.offer(1));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }


    /**
     * 队列满时，add 抛出异常
     * 队列空时，remove 抛出异常
     *
     * @param queue
     */
    private static void add_Remove(ArrayBlockingQueue queue) {
        System.out.println(queue.add(1));
        System.out.println(queue.add(1));
        System.out.println(queue.add(1));
        //System.out.println(queue.add(1));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
