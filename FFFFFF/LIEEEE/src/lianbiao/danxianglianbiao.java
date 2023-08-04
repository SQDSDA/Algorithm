package lianbiao;



import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class danxianglianbiao implements Iterable<Integer>{
    private danxianglianbiao.Node head = new Node(666, null); // 头指针还是没有变得，头指针指向了一个哨兵节点
    @Override
    public Iterator<Integer> iterator() {
        // 匿名内部类 —> 带名字的内部类
        return new NodeIterator();
    }

    // 当某一个类使用了外部类的成员变量时，就不能使用static
    // 当内部类和外部没有联系的话，就需要加static
    private class NodeIterator implements Iterator<Integer> {
        Node p = head;

        @Override
        public boolean hasNext() { // 是否有下一个元素
            return p != null;
        }

        @Override
        public Integer next() {
            int v = p.value;
            p = p.next;
            return v;
        }
    }
    // 怎么理解java的链表创建
    //结点类  采用内部类
    private static class Node{
        int value; // 值
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
//            System.out.println(this.next);
        }
    }

    public void addFirst(int value) {
        // 1. 链表为空的情况下
//        head = new Node(value, null);
        // 2. 链表非空的情况下
        head = new Node(value, head);
    }

    public void loop(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    public void loop3(Consumer<Integer> before, Consumer<Integer> after){
        recursion(head, before, after);
    }

    private void recursion(Node curr, Consumer<Integer> before,
                           Consumer<Integer> after){
        if (curr == null){
            return;
        }

        // 如果代码顺序换一下，会发现是逆序打印
        // 递归的过程是
        before.accept(curr.value);
        recursion(curr.next, before, after);
        after.accept(curr.value);
    }

    public Node findLast(){
        Node p;
        for (p = head; p.next != null; p = p.next){
        }
        return p;
    }

    public void addLast(int value) {
        Node last = findLast();
        last.next = new Node(value, null);
    }


    // 根据链表的索引取出相关元素
    // 为什么要用private，内部进行调用
    // 注意return的写法
    private Node findNode(int index) {
        int i = 0;
        // for (初始化表达式; 循环条件; 循环后操作) {
        //    // 循环体，需要重复执行的代码块
        //}
        for (Node p = head.next; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;  // 没找到
    }

    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            // IllegalArgumentException 和 IllegalAccessException的区别
//            IllegalArgumentException和IllegalAccessException是Java编程语言中两种不同的异常类型。
//            IllegalArgumentException（非法参数异常）： 这是一个运行时异常，通常用于表示方法或构造函数的参数不符合预期或不合法。当使用不合法的参数调用方法或构造函数时，会抛出IllegalArgumentException。例如，如果一个方法要求传入的参数必须是正整数，但你传递了一个负数或零，那么就会抛出这个异常。
//            IllegalAccessException（非法访问异常）： 这同样是一个运行时异常，它主要用于表示访问了某个类、方法或字段，但由于访问权限限制，导致无法合法地进行访问。例如，如果你尝试访问一个类的私有成员，或者在类的外部尝试调用一个私有方法，就会抛出IllegalAccessException。
//            在总结上，IllegalArgumentException主要用于表示方法参数不合法，而IllegalAccessException用于表示无法合法地访问类、方法或字段。这两种异常在代码中都应该被适当地捕获和处理，以便提供更友好的错误信息和错误处理。
            throw new IllegalArgumentException(
                    String.format("index [%d]", index));
        }
        return node.value;
    }

    private IllegalArgumentException illegalIndex(int index){
        return new IllegalArgumentException(
                // 在这个例子中，%d 是一个格式化占位符，表示后面要传入一个整数值。而index就是要传入的整数值，它会替换掉%d所在的位置。同时，%n 是一个特殊的格式化字符，用于表示平台相关的换行符。
                String.format("index[%d] 不合法%n", index)
        );
    }
    // 插入链表中的元素
    public void insert(int index, int value1) {
        if (index == 0) {
            addFirst(value1);
            return;
        }
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        prev.next = new Node(value1, prev.next);
    }
    // 单向链表中的remove 删除第一个节点
    // 让head指针指向第二个节点就行
//    public void removeFirst() {
//        head = head.next;
//    }








//    public int get(int index) {
//        int i = 0;
//        // for循环的第一部分只能定义一个变量
//        //
//        for (Node p = head; p != null; p = p.next, i++) {
//            System.out.println(p.value + "索引是" + i);
//        }
//    }
    // 增强for循环
    // 如何去理解增强for循环



}


