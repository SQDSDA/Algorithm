package find;

// 错在哪里？
// 错在
public class twofen {
    public static int search(int[] nums, int target1) {
        int nums_len = nums.length;
        System.out.println(nums_len);
        int target11 = 0;
        int nums_shang = nums_len;
        int nums_xia = 0;
        int nums_mid = (nums_xia+nums_shang)/2;
        // /：除法符号 当被除数或除数都是整数类型则/符号代表整除 当被除数或除数有一个是浮点型时则/符号代表普         通除法(结果为浮点数)
        // %：取余符号，% 不仅可以对整形取模，也可以对double和float类型取模
        while (target11 != target1) {
            target11 = nums[nums_mid];
            if (nums[nums_mid] < target1) {
                nums_xia = nums_mid;
                nums_mid = nums_xia+nums_shang/2;
                if (nums_mid == nums_shang) {
                    target11 = nums[nums_xia];
                }
            } else if (nums[nums_mid] > target1) {
                nums_shang = nums_mid;
                nums_mid = nums_xia+nums_shang/2;
                if (nums_mid == nums_xia) {
                    target11 = nums[nums_shang];
                }
            }
        }
        int target = nums_mid;
        return target;
    }
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 8, 10};
        int index_target = search(arrayA, 8);
        System.out.println(index_target);
    }
}
//

//// "static void main" must be defined in a public class.
//// "static void main" must be defined in a public class.
//public class Solution {
//    public static int search(int[] nums, int target) {
//        int nums_len = nums.length;
//        System.out.println(nums_len);
//        int target11 = 0;
//        int nums_shang = nums_len;
//        int nums_xia = 1;
//        int nums_mid = (nums_xia+nums_shang)/2;
//        // /：除法符号 当被除数或除数都是整数类型则/符号代表整除 当被除数或除数有一个是浮点型时则/符号代表普         通除法(结果为浮点数)
//        // %：取余符号，% 不仅可以对整形取模，也可以对double和float类型取模
//        while (target11 != target) {
//            target11 = nums[nums_mid];
//            if (nums[nums_mid] < target) {
//                nums_xia = nums_mid;
//                nums_mid = nums_xia+nums_shang/2;
//            } else if (nums[nums_mid] > target) {
//                nums_shang = nums_mid;
//                nums_mid = nums_xia+nums_shang/2;
//            }
//        }
//        // int index_target111 = nums.indexOf(8);
//        // System.out.println(index_target111);
//        return nums_mid;
//    }
//    public static void main(String[] args) {
//        int[] arrayA = {1, 2, 3, 8, 10};
//        int index_target = search(arrayA, 3);
//        System.out.println(index_target);
//    }
//}