package lianbiao;

import java.rmi.NoSuchObjectException;
import java.util.function.Consumer;

public class shuangxianglianbiaoxunhuan {
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
    public shuangxianglianbiaoxunhuan() {
        head = new Node(null, 666, null);
        head.next = head;
        head.prve = head;
    }

    public Node Findlast() {
        return head.prve;
    }

    public void Addlast(int value) {
        Node p2 = Findlast();
        Node p1 = new Node(null, value, head);
        head.prve = p1;
        p1.prve = p2;
        p2.next = p1;
    }

    public void loop(Consumer<Integer> consumer){
        Node p = head.next;
        while (p != head) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void Rmovefisrt(){
        Node p1 = head.next;
        Node p2 = p1.next;
        head.next = p2;
        p2.prve = head;
    }
}
