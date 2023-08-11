package duilie;

import java.util.Iterator;
import java.util.Queue;

public class LinkedListQueue<E>
    // Iterable接口不是必须的，是为了方便调试
        implements Queue<E>, Iterable<E>{
    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    Node<E> head = new Node<>(null, null);
    Node<E> tail = head;

    public LinkedListQueue() {
        tail.next = head;
    }

    public boolean offer(E value) {
        Node<E> added = new Node<>(value, head);
        tail.next = added;
        tail = added;
        return true;
    }


    public boolean add(E e) {
        return true;
    }
    @Override
    public boolean remove(Object o) {
        // 在队列中移除指定元素的实现
        // ... 遍历链表，找到要移除的元素，并执行相应操作 ...
        return true; // 或者返回适当的布尔值
    }




    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }

}
