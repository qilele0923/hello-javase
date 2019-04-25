package com.javase.queue;

import com.sun.deploy.uitoolkit.impl.awt.AWTAppletAdapter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by qi on  2019-04-25 20:50
 * 不存储数据
 * 一个put 操作 必须等 take
 * 不消费不生产
 *
 aaa	 put 1
 bbb	 take 1
 aaa	 put 2
 bbb	 take 2
 aaa	 put 3
 bbb	 take 3

 */
public class SynchronousQueueDemo {


    public static void main(String[] args) throws  Exception{
        BlockingQueue<String> queue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName()+"\t put 1");
                queue.put("1");


                System.out.println(Thread.currentThread().getName()+"\t put 2");
                queue.put("2");

                System.out.println(Thread.currentThread().getName()+"\t put 3");
                queue.put("3");





            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"aaa").start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"\t take 1");
                queue.take();

                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"\t take 2");
                queue.take();

                TimeUnit.SECONDS.sleep(5);
                System.out.println(Thread.currentThread().getName()+"\t take 3");
                queue.take();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"bbb").start();

    }
}
