/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 可變與不可變字串;



class worker
{
    private String name;
    private int tool;
    private  int job;

    
  

   //constructer


    public worker(String name, int tool, int job) {
       this.name=name;
        this.tool=tool;
      this.job=job;
    }

  
    
    
    
      //不增加setter
    //只設getter
    public String getName() {
        return name;
    }

    public int getTool() {
        return tool;
    }

    public int getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "worker{" + "name=" + name + ", tool=" + tool + ", job=" + job + '}';
    }
    
    
    
    
    
}




public class Worker_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        worker a=new worker("Adam", 5, 3);
        //因為worker只有getter 不可變,只能讀取值,無法修改值,更安全
        
        System.out.println(a.getName());
        System.out.println(a.getTool());
        System.out.println(a.getJob());
        System.out.println(a.toString());

        
        
        
        
    }
    
}
