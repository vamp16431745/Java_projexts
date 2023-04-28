package 陣列練習;

import java.util.Arrays;

public class 陣列移除_89 {
    public static void main(String[] args) {
        int[] myNum={10,20,30,40,50,60};
        System.out.println("原本陣列: "+ Arrays.toString(myNum));

        int removeNum =2;
        System.out.println("移除數字順序: " + removeNum);

        if(myNum==null || removeNum==0|| removeNum== myNum.length)
        {
            System.out.println("無法執行移除");

        }

        int[]newNum=new int[myNum.length-1];

        for(int i=0,k=0;i<myNum.length;i++)
        {
            if(i==removeNum)
            {
                continue;
            }

            newNum[k++]=myNum[i];
        }
        System.out.println("新陣列為: "+Arrays.toString(newNum));

    }
}
