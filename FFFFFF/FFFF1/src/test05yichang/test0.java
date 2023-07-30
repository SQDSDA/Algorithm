package test05yichang;

public class test0 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;
        try {
        int num3 = num1/ num2;
        // 如果下边的异常类型和相关异常不匹配的话，依旧会进行报错，和Python一样
        }catch (Exception ex){
            System.out.println("对不起，程序出错了");
        }finally {
            // 无论程序是否出错，相关程序都会执行
            System.out.println("这是finally");
        }
    }
}
