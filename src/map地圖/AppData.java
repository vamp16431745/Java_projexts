/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map地圖;

import 序列化.Class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AppData
{
    private TestExtra te;
    private final String filename;  //final 建構子初值後禁止修改
    
    public AppData()
    {
        filename="app.txt";   //沒指定路徑,預設為專案資料夾
    }


    
    public void SaveData() throws Exception
    {
        FileOutputStream fos =new FileOutputStream(filename);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(this.te);    //this.c 需透過 set班級() 完成設定
        oos.close();
        fos.close();
        
    }
    
    public void ReadData() throws Exception
    {
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream ois=new ObjectInputStream(fis);
        this.te=(TestExtra) ois.readObject();   //(Class) 將讀到的Object 轉 Class
        ois.close();
        fis.close();
    }

    public TestExtra getTe() {
        return te;
    }

    public void setTe(TestExtra te) {
        this.te = te;
    }
}
