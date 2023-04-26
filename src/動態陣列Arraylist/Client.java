/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 動態陣列Arraylist;

import java.util.ArrayList;
import java.io.Serializable;


/**
 *
 * @author user
 */
class Client implements Serializable {
    public  String 名稱;

 private ArrayList<account> 帳戶們;
 

public Client()
{
  this.帳戶們=new ArrayList();
    System.out.println("帳戶建立完成");
    
}


public void 加入帳戶(account y)
{
this.帳戶們.add(y);
System.out.println("加入帳戶:" +y.name);
} 

public void 顯示資料()
{
    
    System.out.println(""+this.名稱+"匯入帳戶成功");
    for(account c:this.帳戶們)
    {
        
        c.顯示帳戶();
    }
    
}

}
