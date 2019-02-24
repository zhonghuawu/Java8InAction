package com.huaa.chapter14.lazy.list;

import lombok.AllArgsConstructor;

import java.util.function.Supplier;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/24 15:07
 */

@AllArgsConstructor
public class LazyList<T> implements MyList<T> {
    final T head;
    final Supplier<MyList<T>> tail;

    @Override
    public T head() {
        return head;
    }

    @Override
    public MyList<T> tail() {
        return tail.get();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
