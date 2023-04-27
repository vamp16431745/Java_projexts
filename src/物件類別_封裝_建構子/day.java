/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 物件類別_封裝_建構子;

/**
 *
 * @author user
 */
public class day 
{
    private int 年 = 0;
    private int 月 = 0 ;
   private int 日 = 0;


public void set年(int 年)
{
    this.年=年;
}
   
public void set月(int 月)
{
    if (月<1 || 月>12 )
    { 
        System.out.println("月份設定失敗:" +月);
        System.out.println("月份必須為1~12月");
        return;



    }
   else
   {
         this.月=月;

    }
    System.out.println("月份設定成功:" + 月);
    
}

    public void set日(int 日)
    {
        if(日<1 || 日>30)
        {
             System.out.println("日期設定失敗:" +日);
        System.out.println("日期必須為1~30日");
        return;
        }
        else 
        {
            this.日=日;

        }
        System.out.println("日期設定成功:" + 日);
    }
        
    public void 顯示資料()
    {
        if(this.年==0 || this.月==0 || this.日==0 )
            System.out.println("日期顯示 無法顯示");
        else
        {
            System.out.println(this.年+"/" + this.月 + "/" + this.日);
        }
        
        
    }
   

}