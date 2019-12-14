package cc.wrj;

import java.util.Arrays;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 5, 6,
                3, 4, 1, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++)                                                  {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
