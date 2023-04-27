/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 文件創立_讀取_刪除;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 文件讀取 {
    

 
    public static void main(String[] args) {
        try {
            File myobj =new File("C:\\Users\\user\\Documents\\filename.txt");
            Scanner myReader =new Scanner(myobj);
            while (myReader.hasNextLine()) {
                String data =myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();
            
        } catch (Exception e) {
            System.out.println("An error accured. ");
            e.printStackTrace();
        }
        
    }
    
}
