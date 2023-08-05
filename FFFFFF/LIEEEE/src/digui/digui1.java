package digui;

public class digui1 {
    // 这是一开始自己写的，在递的过程中，就已经得出最后的值了，其实就不需要归的过程了，因此这里再归其实就会返回最开始的原始值了
    // 解决方法：在递的时候不return，慢慢的向上回溯；在归的时候得到结果，现在是改正后的结果
    public static int[] jiecheng(int nn, int dd) {
        if (nn > 1){
        dd = dd * nn;
        nn = nn - 1;
        int[] numbers = {nn, dd};
        System.out.println(numbers[1]);
        return jiecheng(nn, dd);
    }else {
            int[] numbers = {nn, dd};
            return numbers;
        }
    }

    // 注意理解递归的过程
    public static int digui2(int nn){
        if (nn==1 || nn ==0){
            return 1;
        }else {
            return nn*digui2(nn-1);
        }
    }

    public static void main(String[] args) {
        int gg = 5;
        int dd1 = 1;
        int[] numbers1 = jiecheng(gg,dd1);
        int number2 = digui2(gg);
        System.out.println(numbers1[1]);
        System.out.println(number2);
    }
}
