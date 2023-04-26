/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 動態陣列Arraylist;

/**
 *
 * @author user
 */
public class bank_test {


    public static void main(String[] args) {
        Client c1 = new Client();
        c1.名稱 = "阿忠";


        Client c2 = new Client();
        c2.名稱 = "小明";


        Client c3 = new Client();
        c3.名稱 = "大熊";


        account a1 = new account();
        a1.name = "開心帳戶";
        a1.餘額 = 10000;


        account a2 = new account();
        a2.name = "財富帳戶";
        a2.餘額 = 5000;

        account a3 = new account();
        a3.name = "尊榮帳戶";
        a3.餘額 = 9555;


        bank b1 = new bank();
        b1.名稱 = "國泰銀行";


        bank b2 = new bank();
        b2.名稱 = "花旗銀行";

        bank b3 = new bank();
        b3.名稱 = "王道銀行";


        c1.加入帳戶(a1);
        b1.加入客戶(c1);
        b1.輸出銀行資料();


        c2.加入帳戶(a2);
        b1.加入客戶(c2);
        b1.輸出銀行資料();


        c2.加入帳戶(a3);
        b1.加入客戶(c3);
        b1.輸出銀行資料();


        AppData appData=new AppData();
        appData.setB(b1);
//        try {
//            appData.SaveData();
//            System.out.println("存檔成功");
//
//        } catch (Exception e) {
//            System.out.println("存檔失敗");
//            System.out.println(e.toString());
//            //e.printStackTrace();  //完整錯誤訊息
//        }

        try
        {
            appData.ReadData();
            System.out.println("讀檔成功");
            b1=appData.getB();
            b1.輸出銀行資料();

        } catch (Exception e) {
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
            // e.printStackTrace();   //完整錯誤訊息
        }

    }
}
