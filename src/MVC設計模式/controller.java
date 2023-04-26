/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC設計模式;

/**
 *
 * @author user
 */
public class controller 
{
    private model m1;
    private view v1;
    
    public void create()
    {
        m1=new model("Tom", 80, 90);
        v1=new view();
       
        
    }
    
    public void run()
    {
        String s;
        s= m1.getName() +  "\n"+ m1.getEng() + "\n"+  m1.getMath();
        v1.setText(s);
    }
    
    
    public static void main(String[] args) {
       
        
    }
}
