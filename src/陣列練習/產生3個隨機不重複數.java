package 陣列練習;

import java.util.ArrayList;
import java.util.Random;



public class 產生3個隨機不重複數 {

    public static void main(String[] args) 
    {ArrayList<Integer> numlist = new ArrayList<>();
        Random random = new Random();
        while (numlist.size() < 3) {
            int a = random.nextInt(10); // 隨機生成0-9之間的整數
            if (!numlist.contains(a)) { // 確認該值是否已經在ArrayList中存在
                numlist.add(a);
            }
        }
        System.out.println(numlist);
    }
       
}