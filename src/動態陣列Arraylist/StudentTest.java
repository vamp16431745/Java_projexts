/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 動態陣列Arraylist;

import 動態陣列Arraylist.Student;
import 動態陣列Arraylist.Class;


/**
 *
 * @author user
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Student x1;
         Student x2;
         Student x3;
         Class f1;
        Class f2;
        
        
      // Student a;
      //Student b;
      //Student2 c;
     // Student2 d;
      
      //a=new Student();
      //a.name="老毛";
      //a.eng = 78;
      //a.math=64;
      //a.show();
      
      //b=new Student();
      //b.name="老高";
      //b.eng=88;
      //b.math=78;
      //b.show();
      
      //c=new Student2();
      //c.name="阿潘";
      //c.cook=98;
      //c.art=46;
      //c.show();
      
      //d=new Student2();
      //d.name= "哈邱";
      //d.cook=64;
      //d.art=16;
      //d.show();
              
       x1=new Student("阿瓜",89,88,854);

       x2=new Student("西瓜",56,87,698);

       
        x3=new Student("北瓜",75,31,956);

       
       
       f1=new Class();
       f1.名稱="中班";
              
        f1.加入學生(x1);
        f1.加入學生(x2);
        f1.顯示資料();     
      
      
      f2=new Class();
      f2.名稱="大班";
      f2.加入學生(x1);
        f2.加入學生(x2);
        f2.顯示資料(); 
      
              
      
        
        
        Student someone;
        someone=f1.find學生xxx(852);
        
        if(someone==null)
        {
            System.out.println("找不到");
        }
        else
        {
            System.out.println("找到" +someone.name);
        }
        
      
      
    }
    
}
