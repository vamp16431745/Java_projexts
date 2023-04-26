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
public class View   //Object為預設 可省略
{
     private int id;
    private int width;
    private int height;

    //constructer
    public View(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    
    //getter

    public int getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    
    
    
    public void show()
    {
        System.out.println("---"+this.getClass().getSimpleName() +"---");
        System.out.println("id: "+id +" width: "+width+" height: "+height);
        
    }
    
    
    
}
