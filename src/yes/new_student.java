
package yes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class new_student 
{
    private static Scanner sc = new Scanner(System.in,"Big5");
    public static String 名字;
    public static int 英文;
    public  static int 阿拉伯文;
    
    public static void 設定初值1()
    {
        名字="華仔";
        英文 = 85;
        阿拉伯文 = 66;
    }
    
    public static void 設定初值2()
    {
        名字="阿標";
        英文 = 95;
        阿拉伯文 = 15;
    }
    
    public static void 設定初值3()
    {
        System.out.println("請輸入名字:");
        名字=sc.next();
        System.out.println("請輸入英文成績");
        英文= sc.nextInt();
        System.out.println("請輸入阿拉伯文成績");
        阿拉伯文= sc.nextInt();
        
        
        
        
     }
    
            
    

    
    public static void 呼叫各項成績()
    {
        System.out.println("名字:" + 名字);
        System.out.println("英文:" +英文 );
        System.out.println("阿拉伯文:" +阿拉伯文 );
        System.out.println("總分:" + 讀取輸入.加總(英文,阿拉伯文 ));
        System.out.println("平均:" + 讀取輸入.平均(英文, 阿拉伯文));
        
    }
    
    
}
