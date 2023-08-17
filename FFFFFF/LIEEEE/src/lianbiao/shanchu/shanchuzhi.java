package lianbiao.shanchu;

import lianbiao.fanzhuan.ListNode;

// 根据值删除节点——
public class shanchuzhi {
    // 解题思路1：
    public static ListNode remove1(ListNode sentinel, int a){
        ListNode ss = sentinel;
        ListNode p1 = sentinel.next;
        ListNode p2 = p1.next;
        while(p1.next != null){
            if (p1.val == a) {
                ss.next = p2; // ss是删除前的上一个节点
                p1.next = null;
            } else {
                ss = p1;
                p1 = p1.next;
                p2 = p1.next;
            }
        }
        return sentinel;
    }

    // 解题思路2
    // 通过递归的方式完成
    public static ListNode remove2(ListNode sentinel, int a){
        // 所以循环和递归的关系是什么？？？
        // 循环和递归都是重复执行的方法
        if (sentinel.next == null){
            return sentinel;
        }
        ListNode ss = sentinel;
        ListNode p1 = sentinel.next;
        ListNode p2 = p1.next;
        // 递归问题拆解的妙诀：
        // 1. 找到问题解决的操作化过程
        // 问题拆解：
        // 1. 找到相应的元素
        // 2. 改变指针
        if (p1.val == a) {
            ss.next = p2; // ss是删除前的上一个节点
            p1.next = null;
        } else {
            ss = p1;
        }
        return remove2(ss, a);
    }

    // 问题二：删除倒数第n个节点
//    // 解题方法1：
//    // 递归方法
//    public static ListNode remove_daoshu(ListNode pp, int a){
//        ListNode p1 = pp.next;
//        ListNode p2 = p1.next;
//        if (pp.val == a) {
//            pp.next = p2; // ss是删除前的上一个节点
//            p1.next = null;
//        }
//        return remove_daoshu(p1, a);
//
//    }
    // 比较官方的解法：
    // 方法的亮点在于：通过递归的方式去找倒数的第n个节点
    // 缺点：如果没有哨兵的话，删除不了第一个节点，因为第一个节点之前是没有节点的

    public static ListNode remove_daoshu_dd1(ListNode pp, int a){
        // 在处理的程序中加一个哨兵
        ListNode s = new ListNode(-1, pp);
        recursion(pp, a);
        return pp;

    }
    private static int recursion(ListNode p, int n) {
        if (p == null) {
            return 0;
        }
        int nth = recursion(p. next, n); // 下一个节点的倒数位置
        if (nth == n) {
            p.next = p.next.next;
        }
        return nth + 1; // 倒数节点+1，通过递归的特性完成
    }

    // 问题二：删除倒数第n个节点
    // 解法2：先指定两个节点p1, p2，初始时，这两个指针都指向头节点，如果要找倒数第三个节点，那么就让p1和p2的
    // 位置间隔3，直到p2到null，这时候p1就在倒数第四个节点，然后再执行删除操作就可
    // 注意点：需要有哨兵在
    public static ListNode remove_daoshu_dd2(ListNode pp, int a){
        // 在处理的程序中加一个哨兵
        ListNode s = new ListNode(-1, pp);
        ListNode p1 = s;
        ListNode p2 = s;
        for (int i = 0; i < a+1; i++) {
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return s;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);

//        ListNode n1 = new shanchuzhi().remove1(o1,4);
//        System.out.println(o1.toString());
        ListNode n2 = new shanchuzhi().remove2(o1,4);
        System.out.println(o1.toString());

    }
}
