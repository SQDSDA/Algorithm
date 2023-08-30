package lianbiao.hebing;

import lianbiao.quchong.ListNode;

public class hebingyouxu {
    // 问题：合并两个有序链表，并且合并后有序
    public static ListNode hebingbiao1(ListNode head1, ListNode head2){
        // 我的解题思路：
        // 解题思路1：先把两个链表合在一起，然后用排序算法完成

        return head1;

    }

    // 在比对中生成一个新链表
    // 核心问题在于：
    // 1. 如何去判断以及什么时候去判断
    // 这个代码是有错误的
    // 要考虑到链表的链状特性
    // 增加哨兵可以减少时间复杂度
    //
    public static ListNode hebingbiao2(ListNode head1, ListNode head2) {
        // head1是最新节点，head2是下一个节点
        // 判断条件的问题：
        // 1 - 1-
        // head1是最新节点
        while (head1 !=null || head2 != null){
            // head1 下一个是head2
            ListNode p1 = head1.next;
            if (p1 == null) {
                head1.next = head2;
                return head1;
            }
            if (p1.val <= head2.val){
                head1 = p1;
                // head2 不变
            } else {
                head1.next = head2;
                head1 = head1.next;
                head2 = p1;
            }
    }
        return head1;
    }

    // 递归写法——视频的解法
    // 要有递归的思维想象
    public static ListNode hebing_digui(ListNode head1, ListNode head2) {
        // 新创一个节点
        if (head1 == null) {
            return head2;
        }
        if (head2 == null){
            return head1;
        }
        if (head1.val < head2.val) {
            head1.next = hebing_digui(head1.next, head2);
            return head1;
        } else {
            head2.next = hebing_digui(head1, head2.next);
            return head2;
        }
    }

//     尝试用一个又递又归的写法
//    private static ListNode maopao(ListNode head){
//        return head;
//    }

    // 这个方法和之前自己想的方法区别在于
    // 1. 是否创建一个新的链表
    // 这个方法之所以可以合并[1, 2, 2, 2, 2] 和[1, 5, 5, 5, 5]的原因是
    // 链表的
    public static ListNode hebingbiao3(ListNode head1, ListNode head2) {
        ListNode s = new ListNode(-1, null);
        ListNode p = s;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
                System.out.println(head2);
            }
            p = p.next;
        }
        if (head1 != null) {
            p.next = head1;
        }
        if (head2 != null) {
            p.next = head2;
        }
        return s;
    }



    public static void main(String[] args) {
        ListNode o5 = new ListNode(6, null);
        ListNode o4 = new ListNode(5, o5);
        ListNode o3 = new ListNode(5, o4);
        ListNode o2 = new ListNode(3, o3);
        ListNode o1 = new ListNode(1, o2);
        ListNode o01 = new ListNode(1, o1);

        ListNode n5 = new ListNode(2, null);
        ListNode n4 = new ListNode(2, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode n01 = new ListNode(1, n1);
        ListNode n11 = new hebingyouxu().hebingbiao2(n01, o01);
        System.out.println(n01.toString());
        System.out.println(o01.toString());

    }
}
