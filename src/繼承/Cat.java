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
class Mammal extends Animal{
    protected String favorite_food;

    public Mammal(String favorite_food, String name) {
        super(name);
        this.favorite_food = favorite_food;
    }
    public void favoriteFood()
    {
        System.out.println(name+"喜歡吃"+favorite_food);
    }
    
    

}


public class Cat extends Mammal{

    public Cat(String favorite_food, String name) {
        super(favorite_food, name);
    }
    
public void meowing()
{
    System.out.println(name+"正在喵喵叫");
}
 
    public static void main(String[] args) {
        Cat c1 =new Cat("秋刀魚", "湯姆");
        c1.eat();
        c1.sleep();
        c1.favoriteFood();
        c1.meowing();
        
        
       
    }
    
}
