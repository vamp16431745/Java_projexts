

package yes;

/**
 *
 * @author user
 */
class average {
    public static int a ;
    public static int b ;
    public static int 平均 ;

    static void 設定初值() {
        a = 45;
        b = 59;
        
       }

    static void 顯示資料() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(平均);
       }

    static void 計算() {
        平均 = (a + b)/2;
        }

    static void 評語() {
        if (平均>=60)
        {
            System.out.println("及格");
           
             
        }
        else if (平均<60)
        {
            System.out.println("太慘了 你要重修了~");
        }
        
        
     }
    
    
    static void 跑流程()
    {
        設定初值();
        顯示資料();
        計算();
       顯示資料();
       評語();
    }
    
}
