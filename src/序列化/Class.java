/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Class
{
    public String ClassName;
    private ArrayList< Student>StudentsGroup;
   
     
    
    public Class()
     {       
    this.StudentsGroup =  new ArrayList();
         System.out.println("班級 建構完成");
        
    }

   
   
    
    
    
    public void 加入學生(Student joerty)
    {
        this.StudentsGroup.add(joerty);
        System.out.println("加入學生"+ joerty.name);
    }
    
    public void 顯示資料()
    {
        System.out.println(" " +  this.ClassName + " ");
        for (Student goodjob : StudentsGroup) 
        {
            System.out.println(goodjob.toString());
        }
        
        
    }
    
    
    public Student find學生xxx(int id)
    {
    
        for(Student ihavenoideas:StudentsGroup)
        {
            if (ihavenoideas.id ==id )
            {
                return ihavenoideas;
            }  
        }
    
            return null;
            
            
    }
}
