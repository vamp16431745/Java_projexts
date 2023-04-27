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
public class Dog extends Animal{

     
    
    Dog(String name) {
        super(name);
    }
    
    


    
     
    
  public void barking()
  {
      System.out.println(name+"正在狂吠");
  }    
    


    public static void main(String[] args) {
       
       Dog d1=new Dog("Goofy");
        d1.eat();
       d1.sleep();
       d1.barking();
    }
    
}
