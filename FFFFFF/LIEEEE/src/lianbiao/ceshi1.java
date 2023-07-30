package lianbiao;
//import org.junit.jupiter.api.Test;

public class ceshi1 {
    // java: 无法从静态上下文中引用非静态 方法 test1()
    // 这个错误提示说明你在一个静态上下文（例如静态方法、静态初始化块或静态变量初始化）中尝试引用一个非静态方法test1()。在Java中，静态上下文中只能直接访问静态成员（静态方法、静态变量）或者调用其他静态方法，不能直接访问实例成员（非静态方法、非静态变量）。
    // java的静态和动态就是看你有没有实例么？
    public static void test1() {
        chuangjian list = new chuangjian();
        list.addFirst(1);
        list.addFirst(2);

        list.loop(value->{
            System.out.println(value);
        });

        chuangjian list2 = new chuangjian();
        list2.addFirst(1111);
        list2.addFirst(2);

        list2.loop2(value->{
            System.out.println(value);
        });

        chuangjian list3 = new chuangjian();
        list3.addFirst(2222);
        list3.addFirst(666666);
        for (Integer value : list3) {
            System.out.println(value);
        }

        chuangjian list4 = new chuangjian();
        list4.addFirst(2222);
        list4.addFirst(666666);
        for (Integer value : list4) {
            System.out.println(value);
        }
        int i = list4.get(1);
        System.out.println(i);

    }
    public static void test2() {
        // 测试链表插入
        chuangjian list = new chuangjian();
        list.addFirst(1);
        list.addFirst(3);
        list.addLast(2);

        list.loop(value->{
            System.out.println(value);
        });
        list.insert(0, 99);
        list.loop(value->{
            System.out.println(value);
        });

        list.removeFirst();
        list.loop(value->{
            System.out.println(value);
        });
    }
    public static void main(String[] args) {
//        test1();
        test2();
    }
}
