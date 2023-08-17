package lianbiao.quchong;

import lianbiao.fanzhuan.ListNode;
public class youxuwu {
    // 问题3：如果链表中有重复的元素，如何将这些重复的元素全都去除
    // 解法1：递归
    // 递归递归，递归不一定要全部归回来
    public static ListNode deletewuchong1(ListNode head){
        ListNode p1 = head;
        if (p1.next == null || p1.next.next == null) {
            return head;
        }
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;
        if (p2.val == p3.val){
            ListNode p4 = p3.next;
            // while中的条件是运行条件
            while (p3.val == p4.val) {
                p4 = p4.next;
            }
            p1.next = p4;
        } else {
            p1 = p1.next;
        }
        return deletewuchong1(p1.next);
    }


    //
    // 不同的递归思想，只用递就可以完成，是不是时间复杂度会更小
    // 如何计算递归的时间复杂度
    public static ListNode deletewuchong12(ListNode p){
        if (p == null || p.next == null) {
            return p;
        }
        if (p.val == p.next.val) {
            ListNode x = p.next.next;
            while (x != null && x.val == p.val){
                x = x.next;
            }
            return deletewuchong12(x);

        } else {
            p.next = deletewuchong12(p.next);
            return p;
        }
    }

    // 解法2：不用递归，用循环的方式实现
    public static ListNode deletewuchong13(ListNode p){
        while (p.next.next != null) {
            ListNode p1 = p.next;
            ListNode p2 = p1.next;
            if (p1.val == p2.val){
                // 如何理解for循环
                // 为什么pp.val = p2.val这个判断条件不行
                for (ListNode pp = p1;p1.val == pp.next.val; pp = pp.next){
                p2 = pp.next;
                }
                p.next = p2.next;
            } else {
                p = p.next;
            }
        }
        return p;
    }
    // 不用递归的视频解法



    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        ListNode o01 = new ListNode(1, o1);
        ListNode o0 = new ListNode(1, o01);
        ListNode o011 = new ListNode(-1, o0);
//        ListNode n1 = new youxu().deletechongfu11(o0);
//        System.out.println(n1.toString());
        ListNode n2 = new youxuwu().deletewuchong13(o011);
        System.out.println(o011.toString());
//        ListNode n1 = new shanchuzhi().remove1(o1,4);
//        System.out.println(o1.toString());
    }
}
