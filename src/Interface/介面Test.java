/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author user
 */
public class 介面Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //String StringBuilder 兩個類別都實現了 Charsequence 介面
        String s= "Amy";
        StringBuilder sb =new StringBuilder();
        sb.append("Jack");
        // CharSequence 字串介面 定義字串有哪些功能
        CharSequence cs;
        
        
        cs=s;  //cs 參考(共用)s字串
        System.out.println("長度(字數)"+cs.length());
        System.out.println("產生不可變字串"+cs.toString());
        System.out.println("位置0文字"+cs.charAt(0));
        
        cs=sb;  //cs 參考(共用)sb字串
         System.out.println("長度(字數)"+cs.length());
        System.out.println("產生不可變字串"+cs.toString());
        System.out.println("位置0文字"+cs.charAt(0));
        
    }
    
}
