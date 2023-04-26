/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EditText extends TextView{
    
    private Scanner sc;



//繼承父類的建構子
      public EditText(int id, int width, int height) {
        super(id, width, height);
        sc=new Scanner(System.in);
    }
    
      public void input()
      {
          System.out.println("請輸入資料: " );
          String s;
          s=sc.next();
          this.setText(s);
      }
      
    
}
