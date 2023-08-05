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

    public static void main(String[] args) {
        int[] testArray = { 5, 2, 9, 1, 5, 6};
        int[] test22 = test1(testArray);
        for (int i = 0; i < test22.length; i++) {
            int name = test22[i];
            System.out.println(name);
        }
    }
}
