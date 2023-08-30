package lianbiao.hebing;

import lianbiao.fanzhuan.ListNode;


// 通过递归的方式，实现合并k个链表
public class hebingduoge {
    public static ListNode MergeTwolists(ListNode head1, ListNode head2){
        while (head1 != null && head2 != null){
            ListNode p1 = head1.next;
            if (head1.next == null){
                head1.next = head2;
                return head1;
            }
            if (head2.next == null){
                head2.next = p1;
                return head1;
            }
            if (head1.val <= head2.val && p1.val >=  head2.val){
                // 对于合并链表的雷：位置的变换
//                    ListNode p2 = head2.next;
                    head1.next = head2;
                    head1 = head2;
                    head2 = p1;
//                } else {
//
//                }
            } else {
                head1 = p1;
            }
        }
        return head1;
    }

    public static ListNode MergeKlists(ListNode[] list1){
        return new ListNode(0, null);
    }
    public static void main(String[] args) {
//        ListNode
        // 在这里就不需要在前面添加new了
        ListNode o01 = ListNode.of(1, 2, 3, 4, 5, 6);

        ListNode n1 = ListNode.of(2, 3, 4, 5, 6, 7);
        ListNode x1 = ListNode.of(3, 4, 7, 7,9);
        ListNode[] lists = {
                o01,
                n1,
                x1
        };
        MergeTwolists(n1, x1);
        System.out.println(n1);
        System.out.println(x1);
    }
}
