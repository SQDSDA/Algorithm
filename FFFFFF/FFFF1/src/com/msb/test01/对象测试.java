package com.msb.test01;

public class 对象测试 {
    public static void main(String[] args) {
        面向对象 p1 = new 面向对象(19, "22", 30);
        p1.age = 25;
        p1.height = 182;
        p1.name = "我是猪";
        System.out.println(p1.age);
        System.out.println(p1.height);
        p1.study();
    }
}
