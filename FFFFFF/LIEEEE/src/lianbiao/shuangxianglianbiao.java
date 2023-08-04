package lianbiao;
import java.util.Iterator;

public class shuangxianglianbiao {
    static class Node {
        Node prve;
        int value;
        Node next;

        public Node(Node prve, int value, Node next) {
            this.prve = prve;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public shuangxianglianbiao() {
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prve = head;
    }

    // 根据索引位置找节点
    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++){
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void addLast(int value){

    }


}
