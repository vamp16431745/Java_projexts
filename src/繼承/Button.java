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
public class Button extends TextView
{
    public Button(int id ,int width ,int height)
    {
        super(id, width, height);
    }
    
    public void click()
    {
        System.out.println("---click---");
        System.out.println(this.getText()+"被按下了");
    }
}
