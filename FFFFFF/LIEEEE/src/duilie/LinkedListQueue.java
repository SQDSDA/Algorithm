package duilie;

import java.util.Collection;
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


    // head是哨兵节点
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
    // 要特别去理解 p = p.next这种迭代方法
    // 通过这种方式的迭代
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = head.next;
            @Override
            public boolean hasNext() {
                return p != head;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    // 用peek() 获取第一个节点的值
    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return null;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

}
