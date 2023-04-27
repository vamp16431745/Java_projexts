/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 河內塔;

import java.util.Scanner;

public class 河內塔 
{ private static Scanner sc = new Scanner(System.in);

public static void 河內塔移動 (int discNum, char one ,char two,char three)
{
    if(discNum == 1)
    {
        System.out.printf("將碟子從%C ", one);
        System.out.printf("移動到%C \n" , three);
    }
    else
    {
        河內塔移動(discNum-1, one,three ,two);
        System.out.printf("將碟子從%C ", one);
        System.out.printf("移動到%C \n" , three);
        河內塔移動(discNum-1, two,one,three);
        
    }
  
}

   
    public static void main(String[] args) 
    {
       int discNum;
        System.out.println("請輸入圓盤數量: ");
        discNum = sc.nextInt();
        河內塔移動(discNum,'A','B','C');
    }
    
}
