package digui;

public class digui3 {

    // 先实现一下正常的二分查找，关注dd_new和dd_or的二分查找
    // 和别人的二分对比一下——加入to do list
    public static int erfen1(int a, int[] a_list){
        int len_a = a_list.length;
        int c = a_list[len_a-1];
        int dd_new = len_a-1;
        int dd_or = 0;
        while(c != a){
            if (c>a){
                dd_or = dd_new;
                dd_new = (dd_new-1+dd_or)/2;
            }else if (c<a){
                dd_new = (dd_new-1+dd_or)/2;
            }

            c = a_list[dd_new];
        }
        return c;
    }

    // 递归二分查找
    public static int erfen_digui(int aa, int[] a_list1){
        return f(a_list1, aa, 0, a_list1.length-1);
    }

    private static int f(int[] aa, int target, int i, int j){
        while (i > j){
            return -1;
        }
        int m = (i + j) >>> 1;
        if (target < aa[m]) {
            return f(aa, target, i, m-1);
        } else if (aa[m] < target) {
            return f(aa, target, m+1, j);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[101];  // 创建一个大小为101的数组，索引范围是0到100

        for (int i = 0; i <= 100; i++) {
            numbers[i] = i;  // 将当前索引的值设置为索引本身
        }

        // 打印数组中的值
//        for (int i = 0; i <= 100; i++) {
//            System.out.print(numbers[i] + " ");
//        }
        int result1 = erfen1(0, numbers);
        System.out.println(result1);
    }


}
