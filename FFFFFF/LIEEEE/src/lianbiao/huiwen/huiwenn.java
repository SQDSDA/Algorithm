package lianbiao.huiwen;

import lianbiao.fanzhuan.ListNode;

public class huiwenn {
    // 判断是否为回文链表的步骤
    // 1.找中间点
    // 2.中间点后半个链表反转
    // 3.反转后链表与原链表逐一比较
    public static Boolean judgee(ListNode head){
        ListNode midd = findmid(head);
        ListNode fanmid = fanzhuan2(midd);
//        System.out.println(midd);
//        System.out.println("*");
//        System.out.println(fanmid);
        while (fanmid != null){
            if (fanmid.val != head.val){
                return false;
            }
            fanmid = fanmid.next;
            head = head.next;
        }

        return true;
    }
    public static ListNode findmid(ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    // 方法1——
    // 这个方法不适用于
    public static ListNode fanzhuan1(ListNode head){
        ListNode p1 = head.next;
        ListNode p2 = head.next.next;
        head.next = null;
        while(p2 != null){
            p1.next = head;
            head = p1;
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = head;
        return p1;
    }


    // 构造一个新节点
    public static ListNode fanzhuan2(ListNode head){
        ListNode p1 = new ListNode(head.val, null);
        while(true){
            head = head.next;
            if (head==null){
                break;
            }
            //
            p1 = new ListNode(head.val, p1);
            System.out.println(head.val);
        }
        return p1;
    }

    // 回文方法优化
    // 将步骤1和步骤2结合在一起，即反转链表和找中间点加在一起，接着运行步骤3
    public static Boolean judgee2(ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = new ListNode(head.val, null);
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            p3 = new ListNode(p1.val,p3);
        }
        if (p2 == null){
            p3 = p3.next;
        }
        System.out.println(p3);
        System.out.println(p1);
//        ListNode fanmid = p1;
////        System.out.println(midd);
////        System.out.println("*");
////        System.out.println(fanmid);
        while (p1 != null){
            if (p1.val != p3.val){
                return false;
            }
            p1 = p1.next;
            p3 = p3.next;
        }

        return true;
    }
    public static void main(String[] args) {
        ListNode pp = ListNode.of(1, 2, 3, 4, 5, 5,  4, 3, 2, 1);
//        ListNode midd = findmid(pp);6
//        ListNode ppp = fanzhuan2(pp);
//        System.out.println(ppp);
//        System.out.println(midd);
        Boolean cc = judgee2(pp);
        System.out.println(cc);
    }
}
