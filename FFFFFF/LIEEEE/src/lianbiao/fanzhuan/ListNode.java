package lianbiao.fanzhuan;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static ListNode of(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0, null);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value, null);
            current = current.next;
        }
        // 最终返回的是dummy.next，因此最终of函数得到的并非是一个带头节点的链表
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode reversed = of(1, 2, 3, 4, 5);
        System.out.println(reversed);
    }
}
