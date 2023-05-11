/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 期中作業_序列化;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class account implements Serializable
{
    public String name;
   public  int 餘額;
   
    public  void 顯示帳戶()
    {
        
        System.out.println("帳戶名:"+this.name );
        System.out.println("餘額:" + this.餘額+"元");
        
    }
    
    
}
