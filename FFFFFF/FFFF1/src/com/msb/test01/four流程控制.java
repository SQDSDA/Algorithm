package com.msb.test01;

public class four流程控制 {
    public static void main(String[] args) {
        // 流程控制：顺序，选择和循环
        // 单分支结构和多分支结构
        int score = 71;
        if(score > 80){
            System.out.println(80);
        } else if(score<80){
            System.out.println(79);
        } else {
            System.out.println(81);
        }
        // 循环结构(实现1+2+3+4+5)
        // while循环
        int num1 = 0;
        int sum1 = 0;
        while (num1<=5){
            sum1 += num1;
            num1++;
        }
        // for循环
        int sum = 0;
        for (int num = 1; num<5; num++){
            sum += num;
        }

    }
}
