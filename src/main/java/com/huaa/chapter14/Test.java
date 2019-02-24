package com.huaa.chapter14;

import com.huaa.chapter14.lazy.list.LazyList;
import com.huaa.chapter14.lazy.list.MyList;
import com.huaa.chapter14.lazy.list.Empty;
import com.huaa.chapter14.lazy.list.MyLinkedList;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/24 15:03
 */

public class Test {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>(5, new MyLinkedList<>(10, new Empty<>()));

        MyList<Integer> numbers = from(2);
        int n = 5;
        for (int i = 0; i < n; i++) {
            int num = numbers.head();
            System.out.print(num + " ");
            numbers = numbers.tail();
        }
        System.out.println();

    }

    public static LazyList<Integer> from(int n) {
        return new LazyList<>(n, () -> from(n + 1));
    }
}
