package 陣列練習;

import java.util.Arrays;

public class 動態陣列移動元素 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,3,4,5};
        int j=3;
        System.out.println("原本陣列 :" + Arrays.toString(arr));
        int count=0;
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i]==j)
            {
                count++;

                //移動元素
                for(int k=i;k<arr.length-1;k++)
                {
                    arr[k]=arr[k+1];
                }
                i--;
                //停止
            }
        }

        System.out.print("移動後陣列 :" );
        for(int i=0;i< arr.length-count;i++)
        {
            System.out.println(" "+arr[i]);

        }
        System.out.println();
        System.out.println("整個陣列 :" + Arrays.toString(arr));

    }
}
