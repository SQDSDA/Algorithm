package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class feibonaqi {
    // 兔子问题
    public static int tuzi(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return tuzi(a - 1) + tuzi(a - 2);
        }
    }
    // 爬楼梯问题
    // 很细节，n阶台阶的跳法是前面台阶跳法的和
    public static int louti(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return tuzi(a - 1) + tuzi(a - 2);
        }
    }
    // 斐波那契数列的备忘录改变——记忆法优化
    // 对于记忆法的理解——空间换时间
    // 空间复杂度增加了
    public static int fibonacci(int n) {
        int[] cache = new int[n+1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        return f(n, cache);
    }


    public static int f(int n, int[] cache) {
        if (cache[n] != -1) {
            return cache[n];
        }
        int x = f(n-1, cache);
        int y = f(n-2, cache);
        cache[n] = x+y;
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(tuzi(6));
    }
}
