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
public class bank_account 
{
    private String name;
    private int  balance;

    public bank_account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "bank_account{" + name + "你的餘額還有" + balance + "元"+ '}';
    }
    
    
    
    
    
}
