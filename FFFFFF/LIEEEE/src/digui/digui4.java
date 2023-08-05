package digui;

public class digui4 {
    // 改进过后的冒泡排序
    // 相比于原始的冒泡排序，加另一个校验
    public static int[] test1(int[] aa){
        int c = aa.length;
        for(int d = c; d!=0; d--){
            int cc = 0;
            for(int e = 0; e!=d-1; e++){
                int gg = aa[e];
                int ff = aa[e+1];
                if (gg>ff){
                    cc = cc + 1;
                    aa[e+1] = gg;
                    aa[e] = ff;
                }
            }
            if (cc == 0){
                break;
            }

        }
        return aa;
    }

    // 递归冒泡排序
    // 顺序是错的这个，感觉，换一个例子就很难了，待会实验一下
    public static int[] diguimao(int[] a_list1, int index_all) {
//        for(int d = c; d!=0; d--){
        int cc = 0;
        for (int e = 0; e != index_all - 1; e++) {
            int gg = a_list1[e];
            int ff = a_list1[e + 1];
            if (gg > ff) {
                cc = cc + 1;
                a_list1[e + 1] = gg;
                a_list1[e] = ff;
            }
        }
        if (cc == 0) {
            return a_list1;
        }
        return diguimao(a_list1, index_all-1);
    }

    public static void main(String[] args) {
        int[] testArray = { 5, 2, 9, 1, 5, 6};
        int len_1 = testArray.length;
        int[] test22 = test1(testArray);
        for (int i = 0; i < test22.length; i++) {
            int name = test22[i];
            System.out.println(name);
        }
        int[] test33 = diguimao(testArray, len_1);
        System.out.println(test33);
        for (int i = 0; i < test33.length; i++) {
            int name = test33[i];
            System.out.println(name);
        }


    }
}
