package 陣列練習;

import java.util.Arrays;

public class 陣列移除2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-3];
        int j=3 ,p=1,u=5;

        //新增一個陣列不包含剃除的值

        for(int i=0,k=0;i<arr.length;i++)
        {
            if(arr[i]!=j & arr[i]!=p & arr[i]!=u)
            {
                arr_new[k]=arr[i];
                k++;
            }

        }
        System.out.println("原本陣列: " + Arrays.toString(arr));
        System.out.println("後來陣列: " + Arrays.toString(arr_new));

    }
}
