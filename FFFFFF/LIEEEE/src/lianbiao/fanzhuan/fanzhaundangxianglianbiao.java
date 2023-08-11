package lianbiao.fanzhuan;
// 反转单向链表的解题思路1：
// 构造一个新链表，从旧链表依次拿到每个节点，创建新节点添加至新链表头部，完成后新链表是倒序的
public class fanzhaundangxianglianbiao {
    // 反转单向链表的解题思路1：
    // 构造一个新链表，从旧链表依次拿到每个节点，创建新节点添加至新链表头部，完成后新链表是倒序的
    public ListNode reverseList(ListNode o1) {
        ListNode n1 = null;
        ListNode p = o1;
        while (p != null) {
            n1 = new ListNode(p.val, n1);
            p = p.next;
        }
        return n1;
    }
    // 解题思路2：
    // 构造一个新链表，从旧链表头部移除节点，添加到新链表头部，完成后新链表即是倒序的
    // 区别在于方法1没提供节点外层的容器类，这里提供了，同时不构造新节点
    static class List{
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode first){
            first.next = head;
            head = first;
        }

        public ListNode removefirst(){
            ListNode first = head;
            if (first != null) {
                head = first.next;
            }
            return first;
        }
    }

    public ListNode reverseList2(ListNode head) {
        List list1 = new List(head);
        List list2 = new List(null);
        while (true){
            ListNode first = list1.removefirst();
            if(first == null){
                break;
            }

            list2.addFirst(first);
        }
        return list2.head;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);

        ListNode n1 = new fanzhaundangxianglianbiao().reverseList(o1);
        System.out.println(n1.val);
    }
}
