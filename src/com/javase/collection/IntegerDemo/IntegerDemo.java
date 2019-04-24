package com.javase.collection.IntegerDemo;

/**
 * Created by qi on 2019/4/24 0024.
 **/
public class IntegerDemo {
    public static void main(String[] args) {
        Integer a=99,b=99,c=200,d=200;
        int e=97,f='a';
        int aa =900,bb=900;
        System.out.println(a==b);//true
        System.out.println(c==d);//false
        System.out.println(e==f);//true
    }
}

/**
 * 缓存了-128到127的数值 超出这个范围则重新new对象
 *
 */
