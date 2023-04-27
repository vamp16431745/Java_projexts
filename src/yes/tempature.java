
package yes;

/**
 *
 * @author user
 */
public class tempature {
    public static Double c;
    public static Double f;
    
    

    static void 設定初值() {
        c= 29.0 ;
        f = (c*9)/5 + 32.0 ;
        }

    static void 轉換溫度() {
        System.out.println(c);
        System.out.println(f);
        }
  
    
    static void 跑流程()
    {
        設定初值();
        轉換溫度();
    }
    
    
}
