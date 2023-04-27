/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class password2 
{private static Scanner sc =new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         final int pwd = 85;
        int count =1 ;
         int num;
        for(count=1;count <= 5;)
        {
            System.out.println("請猜0~99的數字: ");
            num = sc.nextInt();
            if (num == pwd)
            {
                System.out.println("恭喜你猜對了");
                break;
                
            }
            
        
        
         if(count == 5)
        {
            System.out.println("你今天運氣真背 ,5次都猜完了");
            
        }
     else 
            {
                System.out.println("歐糟了 重來");
            }
            count++;
        
}
    }
}
