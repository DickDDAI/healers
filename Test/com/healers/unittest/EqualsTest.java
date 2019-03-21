package com.healers.unittest;

import org.junit.Test;

import java.sql.Struct;

/**
 * 1. 通过String创建了解 == 和 equals 的区别
 * 8种基本类型的变量存的都是值本身
 * boolean,byte 1 byte
 * char,shor 2 byte
 * int,float 4 byte
 * long,double 8 byte
 * 1byte = 8bit
 * // 引用数据类型用 == 比较的时候，比较的是他们在堆内存中的地址
 *只有当数据是同一个 new 出来的对象时，他们的比较结果是true,否则是false, 每创建一次对象都会在堆内存中重新开辟空间
 * Object的没有被重写的equals也是比较的对象的内存地址值
 * == 基本类型就是比较的值是否相等，引用类型比较的就是地址是否相等
 * == equals 默认情况比较的是地址值。== 使用于基本数据类型，equals 适用于引用数据类型
 */
public class EqualsTest {
    @Test
    public void strTest(){

        int m = 3;
        int n = 3;

        String str = new String("daidong");
        String str1 = new String("daidong");
        String str2 = new String("daidong");
        String str3 = "abc";
        String str4 = "abc";
        System.out.println("测试0:" + (m == n));
        System.out.println("测试1:" + (str1 == str2));
        System.out.println("测试2:" + str1.equals(str2));

        str1 = str;
        str2 = str;

        System.out.println("测试3:" + str1.equals(str2));
        System.out.println("测试4:" + (str3 == str4));

        // String 类重写了 equals 方法
    }






}
