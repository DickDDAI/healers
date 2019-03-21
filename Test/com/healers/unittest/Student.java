package com.healers.unittest;

import org.junit.Test;

public class Student{
    public boolean equals(Object obj){
        if(!(obj instanceof Student)){
            return false;
        }
        return true;
    }
    @Test
    public void otherObjectTest(){
        Student stu1 = new Student();
        Student stu2 = stu1;
        Student stu3 = new Student();

        System.out.println("堆内存值相同，栈内存引用值不同：" + stu1.equals(stu2));
        System.out.println("堆内存值不同，栈内存引用值也不同:" + stu1.equals(stu3));// 重写 equals方法后
    }

}