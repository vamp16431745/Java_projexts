/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 動態陣列Arraylist;

import 動態陣列Arraylist.Client;
import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class bank implements Serializable
{
    public String 名稱;
    private ArrayList<Client> 客戶們;
    
    public bank()
    {
        this.客戶們=new ArrayList();
        System.out.println("客戶檔案建立完成");
        
    }
    
    
    public void 加入客戶(Client e)
    {
        this.客戶們.add(e);
        System.out.println("加入客戶:"+e.名稱);
                
    }



    public void 輸出銀行資料()
{
    
    System.out.println("加入"+this.名稱+"會員");
    for(Client f:this.客戶們)
    {
        f.顯示資料();
    
    }
    
}

    
    
    
}
