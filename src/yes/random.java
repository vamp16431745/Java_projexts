
package yes;

/**
 *
 * @author user
 */
public class random {
    
    public static double  r ;
    public static int eng ;
    
    public static void 設定亂數()
    {
         r = Math.random(); // 0.0<= Math.random()<1.0
        
    }
    
    public static void 產生英文成績()
    {
      eng = (int)(r*101.0); // eng = (int)(Math.random()*101.0) 產生<100的隨機浮點數
     
    }
    
    public static void 顯示英文成績()
    {
        System.out.println("英文成績"+ eng);
                       
    }
    
    public static void 跑流程() 
    {
       設定亂數();
       產生英文成績();
       顯示英文成績();      
    }
    
    
    
}
