
package yes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Password

{
   private static Scanner sc = new Scanner(System.in);
    public static int ans;
    public static double r;
    public static int guess;
    
    
    
    public static void 設定初始值()
    {
        ans = 8;
        
        //r = Math.random();  // 給一組隨機值
        //guess = (int)(r*10);
        
        guess= sc.nextInt();  //輸入一組數字
        
    }
    
    public static void 顯示猜()
    {
         System.out.println(guess);
    }
    
    
    public static void 判斷答案()
    {
        
        
        if(guess ==ans)
        {
             System.out.println("恭喜你猜對了");
            
        }
        
        else 
        {
            System.out.println("猜錯了 再試一次");
        }
    }
    
    public static void 跑流程()
    {
        System.out.println("請輸入數字:");
        設定初始值();
        顯示猜();
        判斷答案();
                
    }
    
    
    
}
