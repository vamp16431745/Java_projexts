/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {

//        TextView tv1 = new TextView(1, 50, 20);
//        tv1.setText("訊息");
//        TextView tv2 = new TextView(2, 50, 20);
//        tv2.setText("請按OK");
//        Button bt = new Button(3, 50, 20);
//        bt.setText("super button");
//        ViewGroup vg;
//        vg = new ViewGroup(4, 50, 20);
//
//        vg.addView(tv1);
//        vg.addView(tv2);
//        vg.addView(bt);
//        vg.show();
//        bt.click();
//        tv1.show();
//        tv2.show();
//        bt.show();
//        bt.click();
//
//        Button b;
//        b = (Button) vg.findViewById(3);
//        if (b == null) {
//            System.out.println("找不到");
//
//               } else {
//               System.out.println("找到" + b.getId());
//             }

    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
          
            TextView tv_cm;
            EditText et_cm;
            TextView tv_result;

            //  文字訊息    
            tv_cm = new TextView(1, 5, 20);
            tv_cm.setText("身高(cm)");
            tv_cm.show();

            //  輸入文字資料
            et_cm = new EditText(2, 5, 20);
            et_cm.show();
            et_cm.input();

            // 取得輸入文字
            String s_cm;
            s_cm = et_cm.getText().toString();

            //  字串 轉 整數
            int i_cm;
            i_cm = Integer.parseInt(s_cm);

            //  公分換算公尺
            double d_m;
            d_m = i_cm / 100.0;

            //顯示結果訊息
            String s_result;
            s_result = "您身高為" + d_m + "公尺";

            tv_result = new TextView(3, 50, 20);
            tv_result.setText(s_result);
            tv_result.show();

        

    
    }
}
    
