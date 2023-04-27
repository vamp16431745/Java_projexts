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
public class Test_File {
    
    
    

    public static void main(String[] args) 
    {
        Student x1;
        Student x2;
        Class c1;
        
        
        x1=new Student();
        x1.name="大哥";
        x1.eng=88;
        x1.math=78;
        
        
        
        x2=new Student();
        x2.name="二哥";
        x2.eng=98;
        x2.math=58;
        
        
        c1=new Class();
        c1.ClassName="Android班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.顯示資料();
        
        AppData appData;
        appData = new AppData();
        appData.setClass(c1);
        
        try {
            appData.SaveData();
            System.out.println("存檔成功");
            
        } catch (Exception e) {
            System.out.println("存檔失敗");
            System.out.println(e.toString());
              //e.printStackTrace();  //完整錯誤訊息
        }
      
    }
    
}
