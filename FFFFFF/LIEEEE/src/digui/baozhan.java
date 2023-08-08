package digui;

public class baozhan {
    // 求前n个数的所有和
    public static int adddigui(int n){
        if (n == 1) {
            return 1;
        }
        return adddigui(n-1) + n;
    }
    // 每一次调用方法其实都是一个线程，系统不仅仅要进行计算，还要存储和这个方法相关的信息
    // 怎么去理解爆栈：

    // 尾调用：
    // 一些语言的编译器能够对尾调用做优化


    public static void main(String[] args) {
        int cc = adddigui(9);
        System.out.println(cc);
    }
}
