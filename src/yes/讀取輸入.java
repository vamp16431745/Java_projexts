
package yes;

import java.util.Scanner;




public class 讀取輸入{
    
    
    private static Scanner sc = new Scanner(System.in);
    
    public static int 輸入工具1( )
    {
        System.out.println("請輸入數字");
        int x ;
        x = sc.nextInt();
        return x;
        
    }
    
    public static int 輸入工具2(String 傳入訊息)
    {
        System.out.println(傳入訊息);
        int x ;
        x = sc.nextInt();
        return x;
    }
    
    public static int 加總(int 傳入整數1, int 傳入整數2)
    {
      
        int x ;
        x = 傳入整數1 + 傳入整數2;
        return x;
        }
        
        public static double 平均(int num1, int num2)
        {
         double x;
         x=(num1+num2)/2.0;
            return x;
        }
        
    
    
    
    
    public static void 測試輸入()
    {
        System.out.println("第一次輸入成績");
        輸入工具1();
        
         System.out.println("第二次輸入成績");
         int 結果;
         結果 = 輸入工具1();
         System.out.println("收到結果:" + 結果);
         
         System.out.println("第三次輸入成績");
          結果 = 輸入工具2("請輸入英文成績: ");
         System.out.println("收到結果:" + 結果);
         
         System.out.println("第四次輸入成績");
          結果 = 輸入工具2("請輸入阿拉伯文成績: ");
         System.out.println("收到結果:" + 結果);
         
         
    }
    
    public static void 測試加總()
    {
         System.out.println("請輸入2組數字");
        int 結果;
        int x = sc.nextInt();
        int y = sc.nextInt();
         結果= 讀取輸入.加總(x, y);
        System.out.println("結果:" + 結果);
    }
   
    public static void 測試平均() {
        System.out.println("請輸入2組數字");
        double 結果;
        int a = sc.nextInt();
        int b = sc.nextInt();
        結果 = 平均(a, b);
        System.out.println("結果:" + 結果);

    }

 
    
    


}
        
    
    
    

