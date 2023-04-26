/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 文件創立_讀取_刪除;
import java.io.File;
import java.io.IOException;

public class 文件創立 {

   
    public static void main(String[] args) {
        try {
            File myobj = new File("C:\\Users\\user\\Documents\\filename.txt");  //預設會創立在該專案的資料夾  可指定目錄/特定地址
            if (myobj.createNewFile()) {
                System.out.println("File created: "+myobj.getName());
                
            }
            else{
                System.out.println("File already exsists. ");
            }
            
        } catch (Exception e) {
            System.out.println("An error occurred. ");
            e.printStackTrace();
        }
     
    }
    
}
