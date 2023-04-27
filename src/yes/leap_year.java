
package yes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class leap_year {
    private static Scanner sc = new Scanner(System.in);
    public static int year;
    public static double r;
    public static int leap_year;
    
    
    public static void 設定初值()
    {
        //r=Math.random(); // 0<=x<1       //給一組隨機數
        //leap_year=(int)(3000*r);           
        
        r=sc.nextInt();                 //給定輸入值
        leap_year = (int)r;
    }
    
    public static void 判斷閏年()
    {
        if(leap_year%400==0)
            System.out.println(leap_year+"此年是閏年");
        
        else if (leap_year%100==0)
        {
              System.out.println(leap_year+"此年不是閏年");
        }
        
        else if (leap_year%4==0 )
        {
              System.out.println(leap_year+"此年是閏年");
        }
            
       else
                    {
                      System.out.println(leap_year+"此年不是閏年");
                    }
            
        
        
                    
                  
                    
                    
        }
    public static void 跑流程()
    
    {
        System.out.println("請輸入年份");
        設定初值();
       判斷閏年();
    }
    }
    

