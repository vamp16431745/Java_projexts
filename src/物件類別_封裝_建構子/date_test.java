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
public class date_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      day d;
      d=new day();
      
      d.顯示資料();
      
      d.set年(2023);
      d.set月(4);
      d.set日(7);
      d.顯示資料();
       
      
      d.set月(6);
      d.顯示資料();
       
        
    }
    
}
