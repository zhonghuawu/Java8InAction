package com.huaa.chapter10;

import java.util.Optional;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/20
 */

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();
        name.ifPresent(System.out::println);
    }
}
