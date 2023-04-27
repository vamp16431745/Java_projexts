/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 文件創立_讀取_刪除;


import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;


public class 文件寫入 {

 
    
     
    public static void main(String[] args) {
        
        try {
            FileWriter myWriter =new FileWriter("C:\\Users\\user\\Documents\\filename.txt");
            myWriter.write("人之初,性本善,我忘了,太慘了");
            myWriter.close();
            System.out.println("成功寫入文件");
            
        } 
        
        catch (IOException e) 
        {
            System.out.println("寫入發生錯誤");
            e.printStackTrace();
            
        }
        
    }
    
}
