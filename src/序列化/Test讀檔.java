/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化;

/**
 *
 * @author user
 */
public class Test讀檔 {
    

    public static void main(String[] args) 
    {
        Class c1;
        AppData appData;
        appData=new AppData();
        
        try 
        {
            appData.ReadData();
            System.out.println("讀檔成功");
           c1=appData.getC();
           c1.顯示資料();
            
        } catch (Exception e) {
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
            // e.printStackTrace();   //完整錯誤訊息
        }
      
    }
    
}
