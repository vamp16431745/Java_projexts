/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

/**
 *
 * @author user
 */
public class Bird extends Animal{

  

    Bird(String name) {
        super(name);
        
    }
    
    

 
 
    
    
        public void fly() {
        System.out.println(name + "正在飛");
    }
    

    public static void main(String[] args) 
    {
        Bird b1=new Bird("kiwi");

       
        b1.eat();
        b1.sleep();
        b1.fly();
        
    }

}
