package lianbiao;

public class ceshi2 {
    public static void test1() {
        shuangxianglianbiao list1 = new shuangxianglianbiao();
        list1.addLast(999);
        list1.addLast(999);
        list1.addLast(999);
//        list1.findNode(0);
        list1.Insert(0, 888);
        list1.loop(value->{
            System.out.println(value);
        });
    }

    public static void main(String[] args) {
        test1();
    }
}
