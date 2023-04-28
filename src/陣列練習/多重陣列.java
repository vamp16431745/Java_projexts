package 陣列練習;

public class 多重陣列 {


    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        //顯示值
//        System.out.println(myNumbers[1][2]);

        //更改值
//        myNumbers[1][2]=9;
//        System.out.println(myNumbers[1][2]);


        //列出所有值
        for(int i =0;i<myNumbers.length;i++)
        {
            for(int j=0;j<myNumbers[i].length;j++)
            {
                System.out.println(myNumbers[i][j]);
            }
        }




    }
}
