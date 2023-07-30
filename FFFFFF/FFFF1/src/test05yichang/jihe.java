package test05yichang;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class jihe {
    // 集合相比于数组
    // 1. 集合的长度可以修改
    // 2. 集合删除和增加元素效率高
    // 3. 数组中世纪元素的数量可以获取
    // 4. 数组存储：有序，可重复，对无序的，不可重复的场合数组不能满足要求
    // 这里的集合指的是不是链表？
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // 增加元素
        list.add("ccc");
        list.get(0);
        list.set(0, "eeeee");
        for (int i = 0;i < list.size()-1; i ++){
            System.out.println(list.get(i));
        }
    }
}
