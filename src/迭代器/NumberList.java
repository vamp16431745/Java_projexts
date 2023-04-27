/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 迭代器;

import  java.util.ArrayList;
import java.util.Iterator;


public class NumberList {

    
    public static void main(String[] args) 
    {
        //創建數列
        ArrayList<Integer> nums =new ArrayList<Integer>();
        nums.add(5);
        nums.add(12);
        nums.add(8);
        nums.add(23);
        nums.add(30);
        nums.add(45);
        
        //創建迭代器
        Iterator<Integer> it = nums.iterator();
        
        while (it.hasNext()) {
            Integer b = it.next();
            
            if (b<10)
            {
                it.remove();
            }
            
            
        }
        System.out.println(nums);
        
        
    }
    
}
