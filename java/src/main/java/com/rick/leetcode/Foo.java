package com.rick.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Rick
 * @createdAt 2022-06-08 10:07:00
 */
public class Foo {

    private volatile int  runIndex = 0;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        runIndex = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while (runIndex != 1) {

        }
        printSecond.run();
        runIndex = 2;

    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (runIndex != 2) {

        }
        printThird.run();
    }
}
