package cc.wrj;

import java.util.Arrays;
import java.util.Date;

public class BubblingTest {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int[] arr2 = {5, 4, 7, 8, 9, 2, 1, 3, 6};
        int[] arr3 = new int[]{5, 4, 7, 8, 9, 2, 1, 3, 6};
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < arr3.length - 1; i++){
            for(int k = 0; k < arr3.length - i - 1; k++){
                if(arr3[k] < arr3[k + 1]){
                    int temp = arr3[k];
                    arr3[k] = arr3[k + 1];
                    arr3[k + 1] = temp;
                }
                System.out.println(new Date());
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间：" + (endTime - startTime) + "ms");
        System.out.println(Arrays.toString(arr3));
    }
}
