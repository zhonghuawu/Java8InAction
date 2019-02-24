package com.huaa.chapter14.lazy.list;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/24 15:02
 */

public class Empty<T> implements MyList {
    @Override
    public Object head() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MyList tail() {
        throw new UnsupportedOperationException();
    }
}
