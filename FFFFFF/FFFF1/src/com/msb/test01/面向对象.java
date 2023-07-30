package com.msb.test01;

/**
 * 类的命名方式是驼峰命名
 * 类需要先对特性进行编写，特性极为类的属性部分
 * 接下来进行类的行为编写，行为即为类的方法部分
 */

/**
 * 对象的创建和使用
 * 1.
 */
// 万事万物皆对象
// 将“像"的东西抽取出来可以归纳为一个类
// java先创建类，再创建对象
public class 面向对象 {
    // 特征-属性-名词
    String name;
    int age;
    double height;

    // 行为-方法-动词
    // 定义一个学习的方法
    public void study(){
        System.out.println("学习一下学习一下");
    }
    // 显式编写构造器
    // 构造器参数名字如果和属性名字重名，会根据就近原则进行
    // 如果重名，你想要给属性赋值，就在想要表达属性的变量前加上this.来修饰
    public 面向对象(int age, String b, double c){
        this.age = age;
        name = b;
        height = c;
    }

}
