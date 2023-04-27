/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 可變與不可變字串;


public class 不可變字串 
{
    
    

   
    public static void main(String[] args)
    {
        //String 為不可變字串 ,s1 s2 共用同一位置。
        String s1 ="Tom";
        String s2 = "Tom";
        String s3=new String("Tom");
        
        System.out.println("s1==s2 is"+(s1==s2));
        System.out.println("s1==s3 is"+(s1==s3));
        //s3是新增加的物件 不同於s1 s2
        
        StringBuilder sb;
        sb=new StringBuilder();
        //append增加字串
        sb.append("name");
        sb.append("eng");
        sb.append("s1");
        sb.append("omg");
        sb.append(100);
        
        //將可變字串轉為不可變字串
        String s=sb.toString();
        System.out.println(s);
        
        
        //效果等同於以下不可變字串
        
        String s4;
        s4="name"+"eng"+"s1"+"omg"+100;
        System.out.println(s4);
        
                
        
 
    }
    
}
