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
public class date_constructerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        date_constructer  d1 =new date_constructer(1997,9,18);
        date_constructer d2 = new date_constructer(2023, 4, 7);
        
        System.out.println(d1.toString());
         System.out.println(d2.toString());
         
         System.out.println("d2年=" + d2.getYear());
          System.out.println("d2年=" + d2.getMonth());
          System.out.println("d2年=" + d2.getDay());
    }
    
    
}
