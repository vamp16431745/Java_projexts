/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.practice;

/**
 *
 * @author user
 */
public class 圓周率 {

  
         public static void main(String[] args) 
         {
             int loop =1000000;
             int i;
             double pi=0.0;
             for(i=1;i<=loop;i++)
             {
                 pi+= 4 * (Math.pow(-1, i+1) / (2*i-1));
                 if(i%100000==0)
                     System.out.printf("i=%7d時PI=%15.14f%n",i,pi);
                 
             }
                         
             
    
    }
    
}
