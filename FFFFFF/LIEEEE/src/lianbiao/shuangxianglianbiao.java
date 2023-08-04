package lianbiao;
import java.util.Iterator;
import java.util.function.Consumer;

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
    public Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++){
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void addLast(int value){
        Node p1 = new Node(tail.prve, value, tail);
        Node p2 = tail.prve;
        p2.next = p1;
        tail.prve = p1;
    }

    public void Insert(int index, int value){
        Node p1 = findNode(index);
        Node p2 = p1.next;
        Node p = new Node(p1, value, p1.next);
        p1.next = p;
        p2.prve = p;
    }

    public void loop(Consumer<Integer> consumer){
        Node p = head.next;
        while (p != tail) {
            consumer.accept(p.value);
            p = p.next;
        }
    }


}
