package com.huaa.chapter14.lazy.list;

import lombok.AllArgsConstructor;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/24 14:58
 */

@AllArgsConstructor
public class MyLinkedList<T> implements MyList<T> {
    private final T head;
    private final MyList<T> tail;

    @Override
    public T head() {
        return head;
    }

    @Override
    public MyList<T> tail() {
        return tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
