package com.healers.unittest;

import org.junit.Test;
/**
 * Object 有哪些方法
 *
 * */
public class ObjectTest {
    @Test
    public void objectTest(){
        Object object = null;

        object.equals(null); // 1. Object 的 equals 方法
        object.hashCode(); // 2. Object 的 hashCode() 方法。什么时候要重写HashCode() 方法?
        object.toString(); // 3. Object 的 toString() 方法
        object.getClass(); // 4. Object 的 getClass() 方法
        object.notify(); // 5. Object 的 notify() 方法
        try {
            object.wait(); // 6. Object 的 wait() 方法
            object.wait(123124);
            object.wait(13124,23235);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
