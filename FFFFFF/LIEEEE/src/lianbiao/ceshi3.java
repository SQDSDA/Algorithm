package lianbiao;

public class ceshi3 {
    public static void test1(){
        shuangxianglianbiaoxunhuan list1 = new shuangxianglianbiaoxunhuan();
        list1.Addlast(999);
        list1.Addlast(999);
        list1.Addlast(999);
        list1.Addlast(88);
        list1.loop(value->{
            System.out.println(value);
        });
        list1.Rmovefisrt();
        list1.loop(value->{
            System.out.println(value);
        });
    }

    public static void main(String[] args) {
        test1();
    }
}
