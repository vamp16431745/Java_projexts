/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 文件創立_讀取_刪除;

import java.io.File;
public class 文件刪除 {

    public static void main(String[] args) {
        File myobj =new File("C:\\Users\\user\\Documents\\filename.txt");
        if (myobj.delete()) {
            System.err.println("Deleted the file" + myobj.getName());
            
        }
        else
        {
            System.out.println("Failed to delete the data. ");
        }
        
   
    }
    
}
