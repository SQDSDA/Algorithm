package paixu;

public class guibingpaixu {
    // 归并排序的思想是分治法
    // 分治法是将原问题分解为规模较小的子问题，分别解决这些子问题，然后合并
    // 这些子问题的答案

    // 我一开始也觉得递归可以去解决它，为什么我没有去实践呢？
    // 一定要自信，只有自信了才能去完成相应的任务
    // 归并排序的
    // 看看别人的题解，别一直耗着
    public static void sort(int[] array){
        sortSection(array, 0, array.length-1);
    }
    public static void sortSection(int[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end)/2;
        sortSection(array, start, mid);
        sortSection(array, mid+1, end);
        Merger_all(array, start, mid+1, end);
    }
    //
    public static void Merger_all(int[] array1, int start, int start2, int end){
        int len1 = start2 - start;
        int[] tmp = new int[len1];
        // 对于取mid+1的理解
        System.arraycopy(array1, start, tmp, 0, len1);
        int p1 = 0;
        int p2 = start2;
        for (int i = start; i <= end; i++){
            if (tmp[p1] <= array1[p2]){
                array1[i] = tmp[p1];
                p1 ++;
                if (p1 == len1){
                    break;
                }
            } else {
                array1[i] = array1[p2];
                p2 ++;
                if (p2 > end) {
                    while (p1 < len1) {
                        i++;
                        array1[i] = tmp[p1];
                        p1 ++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }

}