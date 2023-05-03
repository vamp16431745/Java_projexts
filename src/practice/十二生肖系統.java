/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 十二生肖系統 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("請輸入西元出生年: ");
        int year = sc.nextInt();
        year-=1900;
        switch(year%12)
        {
            case 0 :System.out.printf("你的生肖是:鼠");break;
             case 1 :System.out.printf("你的生肖是:牛");break;
              case 2 :System.out.printf("你的生肖是:虎");break;
               case 3 :System.out.printf("你的生肖是:兔");break;
                case 4 :System.out.printf("你的生肖是:龍");break;
                 case 5:System.out.printf("你的生肖是:蛇");break;
                  case 6 :System.out.printf("你的生肖是:馬");break;
                   case 7 :System.out.printf("你的生肖是:羊");break;
                    case 8 :System.out.printf("你的生肖是:猴");break;
                     case 9 :System.out.printf("你的生肖是:雞");break;
                      case 10 :System.out.printf("你的生肖是:狗");break;
                       case 11 :System.out.printf("你的生肖是:豬");break;
                        
                  
            
        }
        
        
    }
    
}
