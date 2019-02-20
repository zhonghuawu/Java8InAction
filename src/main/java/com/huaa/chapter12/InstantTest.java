package com.huaa.chapter12;

import java.time.Instant;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2019/2/21 0:14
 */

public class InstantTest {
    public static void main(String[] args) {
        long now = Instant.now().getEpochSecond();
        System.out.println(now);
    }
}
