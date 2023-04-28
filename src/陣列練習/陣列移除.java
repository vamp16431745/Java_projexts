package 陣列練習;

import java.util.Arrays;

public class 陣列移除 {

    //新增一個陣列 不增加要刪除的值
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int[]arr_new=new int[arr.length-2];
        int j=6;
        int p=3;
        for(int i =0,k =0;i<arr.length;i++)
        {
            if(arr[i]!=j&arr[i]!=p)
            {
                arr_new[k]=arr[i];
                k++;
            }
        }

        System.out.println("原本陣列: " + Arrays.toString(arr));
        System.out.println("後來陣列: " + Arrays.toString(arr_new));

    }
}
