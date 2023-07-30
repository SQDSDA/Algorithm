package test02;

public class duiying {
    // 不能在一个类里边直接引入另一个类
    public static void main(String[] args) {
        fengzhuang p1 = new fengzhuang();
        p1.setAge(40);
        System.out.println(p1.getAge());
//        p1.age = 30;
//        System.out.println(p1.age);
    }
}
