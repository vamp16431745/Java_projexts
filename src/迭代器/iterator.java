/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 迭代器;

import  java.util.ArrayList;
import java.util.Iterator;

        
        
        
public class iterator {

    
    

    public static void main(String[] args) {
        
        //創建陣列
        ArrayList<String> food=new ArrayList<String>();
        food.add("salad");
        food.add("hamburger");
        food.add("noodle");
        food.add("ice_cream");
        
        //做一個迭代器
        Iterator<String> it =food.iterator();
        
        //印出第一個
       // System.out.println(it.next());
        
        //印出剩下的
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        

    
    }
    
}
