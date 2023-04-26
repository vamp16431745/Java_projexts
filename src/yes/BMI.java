
package yes;



public class BMI {

   public  static double r;
    public static double  cm;
    public  static double kg;
    public static double m;
    public static double bmi;
    
    
    
    //功能
   

    static void 設定初值() 
    { r = Math.random();
        cm = r*201;
       kg = r*101;
       m = cm/100;
       bmi = kg/(m*m);
       }
    
     static void 顯示資料() 
    {
        System.out.println("cm:"+cm);
        System.out.println("kg:"+kg);
        System.out.println("m:"+m);
        System.out.println("bmi:"+bmi);
        if  (bmi<18.5)
        {
            System.out.println( "過輕");
        }
        
       else if (bmi<24)
        {
            System.out.println( "正常");
        }

        else if (bmi<27)
        {
            System.out.println( "過重");
        }
        
        else if (bmi >=27)
        {
             System.out.println( "快點去運動!");
        }
       
        

        }
     
     static void 跑流程()
     {
         設定初值();
         顯示資料();
     }
     
     
     
    
}
