package digui;

import java.util.Arrays;

public class hannuota {
    public static int test1(){
        int[] A = new int[64] ;
        int[] B = new int[64] ;
        int[] C = new int[64] ;
        Arrays.fill(B, 0);
        Arrays.fill(C, 0);
        for (int i = 0;i < 64; i++){
            A[i] = i+1;
        }
        System.out.println(A);
        C[63] = A[0];
        A[0] = 0;
        B[63] = A[1];
        A[1] = 0;

        B[62] = C[63];9
        C[63] = 0;
        C[63] = A[2];

        return 666;
    }

    public static int test2() {

        return 777;
    }
}
