package cc.wrj;
import java.util.Arrays;
import java.util.Date;

public class ChoiceTest02 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 7, 8, 9, 2, 1, 3, 6};
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            int maxIndex = i;
            for(int j = i; j < arr.length - 1; j++){

                if(arr[maxIndex] < arr[j + 1]){
                    maxIndex = j + 1;
                }
                System.out.println(new Date());
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        System.out.println(Arrays.toString(arr));
    }
}

