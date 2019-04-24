package com.javase.collection.list;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qi on 2019/4/24 0024.
 **/
public class AsListDemo {
    public static void main(String[] args) {
        String[] flag= {"2","3","4"};
        List<String> list = Arrays.asList(flag);
        //如果想正常使用，则可以
       // ArrayList<String> list = new ArrayList<>(Arrays.asList(flag));

        list.remove(0);
        list.add("5");
      //  list.clear();
        for (String s : list) {
            System.out.println(s);
        }
    }
}

/**
 * 打印结果均抛异常
 * Exception in thread "main" java.lang.UnsupportedOperationException:UnsupportedOperationException
 *分析：
 * 这个返回的list  java.util.Arrays.ArrayList<E>下的并不是java.util下的，而且ArrayList<E> extends AbstractList<E>
 * 这个抽象类的add 和 remove clear set方法 均会抛异常，由于ArrayList只重写了set方法 故而add clear remove 会抛异常
 *
 * 总结
 * Arrays.asList()返回固定尺寸的List。任何视图改变长度的操作均会抛异常
 *
 *
 *
 */
