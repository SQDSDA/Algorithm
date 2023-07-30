package com.msb.test01;

public class five数组 {
    public static void main(String[] args) {
        // 数据内部类型必须都是一致的
        int[] arr;
        arr = new int[4];
        // 也可以用一行写完
        // int [] arr = new int[4]
        arr[0] = 15;
        arr[1] = 91;
        arr[2] = 17;
        arr[3] = 62;
        for (int cc = 0; cc<4; cc++){
            System.out.println(arr[cc]);
        }
        // 增强for循环：代表直接对数组内的元素进行遍历
        for (int num:arr){
            System.out.println(num);
        }
    }


}
