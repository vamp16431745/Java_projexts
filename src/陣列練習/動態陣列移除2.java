package 陣列練習;

import java.util.ArrayList;
import java.util.Arrays;

public class 動態陣列移除2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,3,4,5};
        ArrayList<Integer>arr_new=new ArrayList<Integer>();
        for(int i:arr)
        {
            arr_new.add(i);
        }
        arr_new.remove(3);
        System.out.println("原本陣列: "+ Arrays.toString(arr));
        System.out.println("更改後陣列: " +arr_new );
    }
}
