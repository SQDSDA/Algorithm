package lianbiao.chazhao;

import lianbiao.fanzhuan.ListNode;

public class cha1 {

    // 问题：查找中间链表
    // 解决方法：用快慢指针法
    // 一个指针一次走一步，一个指针一次走两步的方式
    public static ListNode findmid(ListNode head1){
        ListNode p1 = head1;
        ListNode p2 = head1;
        while (p1 != null && p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode head2 = ListNode.of(1, 2, 3 ,4 , 5);
        ListNode head3 = findmid(head2);
        System.out.println(head3);
    }


}
