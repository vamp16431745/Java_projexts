/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


public class TaipeiBank 
{   
    int account;
    int balance;
    void printinfo()
    {System.out.printf("帳戶:%d , 餘額: %d%n", account,balance);}

   
    public static void main(String[] args) 
    {
        TaipeiBank[] shilin=new TaipeiBank[5];
        
        for(int i=0;i<shilin.length;i++)
        {
            shilin[i]=new TaipeiBank();
            shilin[i].account=10000001+i;
            shilin[i].balance=0;
        }
        
        for (TaipeiBank juggyugtu:shilin)
            juggyugtu.printinfo();
        
        
    }
    
}
