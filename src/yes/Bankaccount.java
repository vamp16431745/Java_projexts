
package yes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bankaccount {
    
    private static Scanner sc = new Scanner(System.in);
    public static String 帳戶名稱;
    public static double 存入金額;
     public static double 提款金額;
     public static double 帳戶餘額;
      public static double 初始金額;
     public static double r1;
     public static double r2;
     public static boolean x;
     
     
     
     public static void 設定初值()
     {
         帳戶名稱= "老王";
         初始金額 = 500.0;
         System.out.println("帳戶名稱:" + 帳戶名稱 +"還有" +初始金額+"元" );
         System.out.println("請輸入此次存錢及提領金額");
         r1= sc.nextInt();
         r2=sc.nextInt();
         
     
     }
   
           
    
     public static void 存隨機錢()
     {
         
         //帳戶餘額+=  (int)(r1*50001);
         帳戶餘額=初始金額+r1;
         
     }
     
     public static void 提隨機款()
     {
         //帳戶餘額-= (int)(r2*50001);
         帳戶餘額-=初始金額-r2;
     }                  
     
      public static void 存提隨機錢()
     {
         
         //帳戶餘額=帳戶餘額 + (int)(r1*50001) - (int)(r2*50001);
         if (r2<=(r1+初始金額))
         {
             帳戶餘額=初始金額 + r1 - r2;
         }
         else 
         {
             帳戶餘額=初始金額 + r1;
         }
         
         
         
     }
     
     
     public static void 顯示存餘額()
{
    System.out.println("帳戶初始有500元");
    //System.out.println("此次存入" +(int)(r1*50001) +"元");
    System.out.println("此次存入" +r1 +"元");
    System.out.println(帳戶名稱 +  "你還有" + 帳戶餘額  +"元");
}
     

    
       public static void 顯示提領餘額()
{
    System.out.println("帳戶初始有"+初始金額+"元");
    //System.out.println("此次提領" + (int)(r2*50001) +"元");
    System.out.println("此次提領" + r2 +"元");
    if(帳戶餘額>0)
    {System.out.println(帳戶名稱 +  "你還有" + (初始金額 +r1-r2 )+"元");}
    else 
    {
        System.out.println("餘額不足");
    }
}
       
       
        public static void 顯示存提餘額()
{
    
    
    System.out.println("帳戶初始有500元");
    //System.out.println("此次存" + (int)(r1*50001) + "領"+(int)(r2*50001)+ "元");
    System.out.println("此次存" + r1 + "領"+r2+ "元");
    if (帳戶餘額==(初始金額+r1-r2))
    {System.out.println(帳戶名稱 +  "你還有" + 帳戶餘額+ "元");
    }
    else
    {
        System.out.println("餘額不足");
    }
    
}
     
        public static boolean 存款達標(int mem)
        {
            
           if (帳戶餘額>=mem) {
                x=true;
               
            }
            return x;
          
        }
        
    
        public static void  會員資格()
        { int mem = 5000;
            if(x)
             System.out.println("恭喜達到尊貴會員資格");
        else
             System.out.println("離會員資格還差"+ (mem-帳戶餘額) + "元");
        
    }
        
     
     
     public static void 跑存款流程()
     {
         設定初值();
         存隨機錢();
          顯示存餘額();   
     }
     
      public static void 跑提款流程()
     {
         設定初值();
         提隨機款();
          顯示提領餘額();   
     }
     
      public static void 跑存提款流程()
     {
         設定初值();
         存提隨機錢();
          顯示存提餘額();
          存款達標(5000);
          會員資格();
     }
     
}


