package lianbiao.huanxing;


import lianbiao.fanzhuan.ListNode;

// 弗洛伊德环形算法
public class fuluoyide {
    public static boolean panhuan(ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
