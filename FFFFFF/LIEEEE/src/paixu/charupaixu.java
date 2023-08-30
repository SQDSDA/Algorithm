package paixu;

public class charupaixu {
    // 插入排序的思想：
    // 插入排序和冒泡排序的思想差异有哪些？
    // 排序的处理方式是一样的，但是在基本有序的情况下，插入排序的时间复杂度会耕地
    public static int[] test1(int[] a) {
        int len_a = a.length;
        for (int i = 0; i < len_a - 1; i++) {
            int bb = a[i];
            int cc = a[i + 1];
            if (bb > cc) {
                int iii = i + 1;
                for (int ii = i + 1; ii >= 0; ii--) {
                    int dd = a[ii];
                    if (cc < dd) {
                        a[ii] = cc;
                        a[iii] = dd;
                        iii = ii;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] testArray = {5, 2, 9, 1, 5, 6};
        int len_1 = testArray.length;
        int[] test22 = test1(testArray);
        for (int i = 0; i < test22.length; i++) {
            int name = test22[i];
            System.out.println(name);
        }
    }
}