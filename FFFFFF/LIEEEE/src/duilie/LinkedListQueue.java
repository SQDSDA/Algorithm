package duilie;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


// 怎么理解队列？
// 队列是以顺序的方式维护的一组数据集合，在一端添加数据，从另一端移除数据，添加的一段为尾，移除的一端为头
// 队列和链表的区别在于哪里？
//
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
    private int size;
    private int capacity = Integer.MAX_VALUE;
    // 把初始化过程中的重复代码写到这里
    {
        tail.next = head;
    }
    public LinkedListQueue(int capacity){
        this.capacity = capacity;
    }
    public LinkedListQueue() {
    }

    public boolean offer(E value) {
        if (isFull()){
            return false;
        }
        Node<E> added = new Node<>(value, head);
        tail.next = added;
        tail = added;
        size++;
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
    public E poll() {
        if (isEmpty()){
            return null;
        }
        Node<E> first = head.next;
        head.next = first.next;
        size--;
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }


    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
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

    // 从队列头获取第一个节点值，并移除

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
        return head.next.value;
    }


    @Override
    public int size() {
        return 0;
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
