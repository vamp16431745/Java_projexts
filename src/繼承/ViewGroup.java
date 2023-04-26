/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ViewGroup extends View
{
    private ArrayList<View> views;
   
    
    //繼承父類的建構子
    
    public ViewGroup(int id,int width,int height)
    {
        super(id, width, height);
        this.views=new ArrayList();
    }
        
        
        public void addView(View rtyu)
        {
            this.views.add(rtyu);
        }
      
        @Override  //覆寫 改寫父類別方法
       public void show()
       {
           for(View tyu:views)
           {
               tyu.show();
           }
       }
       
       public View findViewById(int id)
       {
           for(View yyy:views)
           {if(yyy.getId()==id)
           {
               return yyy;
           }
           
               
           }
        return null;
           
       
       }
        
        
    }

    
    

