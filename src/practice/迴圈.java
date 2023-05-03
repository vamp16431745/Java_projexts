/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author user
 */
public class 迴圈 {

    
    
    
    public static void loop()
    {
        int sum=0;
        int i;
        for (i=1;i<=10;i++)
        {
            sum=i+sum;
        }
        System.out.println(sum);
    }
    
    
     
    public static void main(String[] args) 
    {
        loop();
       
    }
    
}
