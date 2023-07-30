package com.msb.test01;

public class 基础运算符 {
    public static void main(String[] args) {
        // 算术运算符
        // 加号：作用 ：（1）表示正数 （2）表示相加操作 （3）字符串拼接
        System.out.println(+10);
        // 只要+左右两侧任意一侧是字符串，那么结果一定是字符串
        // 字符串一定要用“”
        System.out.println("ssss"+10);
        // System.out.println('DIIIDI'+10);
        int a = 5;
        int m = a++ + 7; // ++如果在变量后面的话，会先运算后+
        int n = ++a + 7; // ++如果在变量前面的话，会先+1，后运算
        a++;
        System.out.println(a);
        ++a; // ++a和a++是一样的
        System.out.println(a);
        System.out.println(m);
        System.out.println(n);

        // 赋值运算符 =，+=，-=，/=

        //关系运算符
        // 关系运算符最后返回的结果是布尔值，要么是true，要么是false
        System.out.println(5==6);
        System.out.println(5==5);
        // 逻辑运算符：逻辑运算符左右连接的是布尔值
        // &&（与）左右两边有一个是false，那么就是false，两边都是true才会返回true
        // ||或运算符，
        System.out.println(true&&false);
        System.out.println(true&&false);
    }
}
