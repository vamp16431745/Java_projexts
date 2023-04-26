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
public class view 
{
    private CharSequence text;

    
   //getter 
    public CharSequence getText() {
        return text;
    }

    //setter
    public void setText(CharSequence text) {
        this.text = text;
        this.show();
    }
    
    private void show()
    {
       
        System.out.println(this.text);
          System.out.println("----------"+ this.getClass().getSimpleName()+"----------");
    }
    
    
    
}
