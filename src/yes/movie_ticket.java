

package yes;

import java.util.Scanner;


public class movie_ticket
{
    
    public static int 人數;
    public static int 總金額;
    private static  Scanner sc = new Scanner(System.in,"Big5");
    public static String 輸入框1;
     public static int 票價;
     
    
    

    public static  void 計算()
    {
         System.out.println("請輸入票種 + 人數");
         輸入框1=sc.next(); 
         
         if (null!=輸入框1)
        switch (輸入框1) {
            case "full":
                票價=310;
                break;
            case "good":
                票價=290;
                break;
            case "child":
                票價=260;
                break;
            case "bird":
                票價=280;
                break;
            case "love":
                票價=155;
                break;
            default:
                break;
        }
        System.out.println("票價為:"+票價);
         人數=sc.nextInt();
         System.out.println("人數為:"+人數);
         總金額= 票價*人數;
          System.out.println("此次購買" + 輸入框1 + ",人數:" + 人數 +"人");
          System.out.println("總金額為:"+總金額);
        
    }
   
}
