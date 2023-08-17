package lianbiao.quchong;

import lianbiao.fanzhuan.ListNode;

// 对于链表题中，删除链表的感悟：
// 既然不能获取到prev节点，那么就
public class youxu {
    // 问题：有序链表删除重复元素
    // 注意点：这是有序链表，所以大小都是按位置排的，所以只需要进行前后比较即可
    // 解法1：前后两个节点进行比对，如果重复就delete
    // next不是方法，所以不用next()
    public static ListNode deletechongfu11(ListNode head) {
        // 在判断两个节点是否相等的时候，不能用p1 == p2这样去判断，因为想要判断的其实是节点的值，而非是节点本身
        // 因为节点本身是
        ListNode p1 = head;
        while (p1.next != null){
            ListNode p2 = p1.next;
            if (p2.val == p1.val){
                p1.next = p2.next;
            } else {
            p1 = p1.next;
            }
        }
        return head;
    }
    // 解决放法2：递归
    // 好像删除不需要head
    // 加深对于递归嵌套的理解
    // 有时候错误不会在递归本身，而是在于其中的步骤细节
    public static ListNode deletechongfu2(ListNode head) {
        //
        ListNode p1 = head;
        ListNode p2 = p1.next;
        if (p2 == null) {
            return head;
        }
        if (p2.val == p1.val){
            p1.next = p2.next;
        } else {
            p1 = p1.next;
        }
        return deletechongfu2(p1);
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        ListNode o01 = new ListNode(1, o1);
        ListNode o0 = new ListNode(1, o01);
//        ListNode n1 = new youxu().deletechongfu11(o0);
//        System.out.println(n1.toString());
        ListNode n2 = new youxu().deletechongfu2(o0);
        System.out.println(o0.toString());
//        ListNode n1 = new shanchuzhi().remove1(o1,4);
//        System.out.println(o1.toString());
    }
}