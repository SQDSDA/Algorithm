package com.msb.test01;

public class 数据类型 {
    public static void main(String[] args) {
        // 【基本数据类型】
        // 数值型：整数类型（byte，short，long）和浮点类型（flodat，double），字符型（char），布尔型（boolean）
        byte a = 30; // -128 - 127
        short b = 10; // 表述范围：正负3万
        int c = 10; // 正负21亿
        long d = 10; //数值类型：很大很大。如果表述范围超过了int数据类型范围，需要加L

        // 浮点类型
        float e = 3.14f; // 如果float类型表示一个小数，后面必须加上f
        double f = 3.14;

        // 字符串
        char g = 'a';
        System.out.println("nihao");

        // 布尔类型
        boolean flag = true; // true flase


    }
}
