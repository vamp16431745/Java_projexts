/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 序列化;

import java.util.ArrayList;
import yes.讀取輸入;
import java.io.Serializable;


public class Student implements Serializable
{
    public String name;
    public int eng;
    public int math;
    public  int id;

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", eng=" + eng + ", math=" + math + '}';
    }
    

    
    
    
    
    
  
    
    public void show()
    {
        System.out.println("id:" + this.id);
        System.out.println("name:"+this.name );
        System.out.println("eng:" + this.eng);
        System.out.println("math:" +this.math );
        System.out.println("tot:" +讀取輸入.加總(this.eng, this.math) );
        System.out.println("avg:" + 讀取輸入.平均(this.eng, this.math));
        System.out.println("------------------------------------------------");
    }
}

class Student2
{
    public String name;
    public int cook;
    public int art;
     public  int id;
    
    
    public void show()
    {
        System.out.println("id:" + this.id);
        System.out.println("name:"+this.name );
        System.out.println("cook:" + this.cook);
        System.out.println("art:" +this.art );
        System.out.println("tot:" +讀取輸入.加總(this.cook, this.art) );
        System.out.println("avg:" + 讀取輸入.平均(this.cook, this.art));
        System.out.println("------------------------------------------------");
    }
}


  
   
