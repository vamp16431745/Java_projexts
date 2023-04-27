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
public class bank_accountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        bank_account a =new bank_account("老高", 999999999);
        bank_account b = new bank_account("阿米", 9);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
    
}
