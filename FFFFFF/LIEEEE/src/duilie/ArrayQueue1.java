package duilie;

import java.util.Collection;
import java.util.Iterator;
// 队列环形数组的优点
// 三种实现队列判满的方法：
// 第一种：head和tail所存储的即为索引值，和第三种方法的区别在于已经计算过了
// 第二种：用size方法来判断
// 第三种：head和tail要计算过后才能得到具体的索引值

import java.util.Queue;

// 基于数组实现队列
// 队列环形数组的索引：取模
// 队列环形数组的判空和判满
// 判空：首尾指针都指向同一个元素
// 判满：一般来说尾指针承担最后一个元素的作用
// （tail + 1） %5
public class ArrayQueue1<E> implements Queue<E>, Iterable<E> {

    private E[] array;
    private int head = 0;
    private int tail = 0;
    // 用size来实现
    // 要维护size
    private int size = 0;
    @SuppressWarnings("all")
    public ArrayQueue1(int capacity){
        array = (E[]) new Object[capacity+1];
    }
    @Override
    public boolean add(E e) {
        return false;
    }

    // 数组新增元素
    // 往队列的尾部新增元素
    @Override
    public boolean offer(E value) {
        if (isFull()){
            return false;
        }
        array[tail] = value;
        tail = (tail + 1) % array.length;
        return true;
    }

    // 迭代器方法
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;
            // 用count和size的判断来取代最后tail位置的作用
            int count = 0;
            // 在p不等于tail的时候不断循环
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                E value = array[p];
                p = (p+1) % array.length;
                count++;
                return value;
            }
        };
    }
    @Override
    public E remove() {
        return null;
    }

    // 从队列的头部移除元素
    // 在移除了头部的元素后，头指针的下一个索引并不会变，在环形数组中，其索引位置是固定的
    //
    @Override
    public E poll() {
        if(isEmpty()){
            return null;
        }
        // 为什么这个可以移除第一个元素？
        E value = array[head];
        // head往后移动后，就代表移除了第一个元素，head用于标记
        // 将head转换为长整型转换为整数类型
        head = (int) (Integer.toUnsignedLong(head + 1)) % array.length;
        size--;
        return value;
    }

    @Override
    public E element() {
        return null;
    }

    // 取出数组的第一个元素值
    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        return array[head];
    }

    @Override
    public int size() {
        return 0;
    }

    // 判断数组是否为空
    @Override
    public boolean isEmpty() {
        return head == tail;
    }


    public boolean isEmpty2() {
        return size == array.length;
    }
    // 判断数组是否为满
    public boolean isFull() {
        return (tail+1) % array.length == 0;
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

    public static void main(String[] args) {
        // 用Integer.toUnsignedLong方法将更大的数转换为长整型的数字
//        Integer.toUnsignedLong();
    }
}
