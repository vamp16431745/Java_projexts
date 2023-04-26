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
public class Animal {
    protected String name;

    //constructer
    public Animal(String name) {
        this.name = name;
    }

  public void eat()
  {
      System.out.println(name+"正在吃飯");
  }
  
  public void sleep()
  {
      System.out.println(name+"正在睡覺");
  }
}

  
 
   