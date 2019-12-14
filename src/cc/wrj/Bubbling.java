package cc.wrj;

import java.util.Arrays;

public class Bubbling {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 2, 4, 6, 9, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                //System.out.println(k);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
