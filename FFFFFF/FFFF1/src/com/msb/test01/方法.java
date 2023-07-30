package com.msb.test01;

public class 方法 {
    // [修饰符1 修饰符2] 返回值类型 方法名称 方法名 参数列表 Java语句
    // 返回值类型必须和返回值相同
    // void就代表不返回任何东西，因此在最后返回的时候直接写return就好
    public static int Method1(int x, int y) {
        int cc = x + y;
        return cc;
    }
    public static void main(String[] args) {
        int dd = 30, nn = 50;
        int ff = Method1(dd, nn);
        System.out.println(ff);
    }
    // 方法的重载,方法名一样，但是参数内容不一样
    public static int Method2(int x, int y){
        int dd = x + y;
        return dd;
    }
    public static int Method2(int x, int y, int z){
        int dd = x * y;
        return dd;
    }

}
