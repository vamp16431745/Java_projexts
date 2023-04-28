package 陣列練習;

import java.util.ArrayList;
import java.util.Arrays;

public class 動態陣列移除1 {
    public static void main(String[] args) {

        int[]arr={1,3,3,4,5};
        ArrayList<Integer> arr_new=new ArrayList();
        int j =3;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=j)
            {
                arr_new.add(arr[i] );
            }
        }
        System.out.println("原本陣列: " + Arrays.toString(arr));
        System.out.println("後來陣列: " + arr_new);


    }
}
