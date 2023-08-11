package digui;

public class digui5 {
    // 递归的多路调用，这里的多路调用是指，每个实例函数包含多个自身调用
    // 一个递归问题被插成多个子问题，就需要用多路调用完成
    public static int test1(int a){
        if (a == 0){
            return 0;
        } else if (a == 1){
            return 1;
        } else {
            return test1(a-2) + test1(a-1);
        }
    }

    public static void main(String[] args) {
        int dd = test1(8);
        System.out.println(dd);
    }
}
