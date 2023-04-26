/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;


public class TextView extends View  //extends 繼承

{
    private CharSequence text;
    
    public TextView(int id,int width,int height)
    {
        super(id, width, height);    //super()呼叫父類別建構子
    }

    //getter
    public CharSequence getText() {
        return text;
    }

    //setter

    public void setText(CharSequence text) {
        this.text = text;
    }
    

    
    @Override //覆寫 改寫父類別
    public void show()
    {
        super.show(); //呼叫父類別
       if(text==null) 
       {
           System.out.println("");
       }
       else
       {
           System.out.println("text:"+text);
       }
        
    }
    
    

}

