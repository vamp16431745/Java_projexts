package map地圖;

import 動態陣列Arraylist.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        String key;   //字串類型
        Object value;  //任意物件類型

        //Map 映射容器 (透過key管理value)
        HashMap<String,Object> map;
        map=new HashMap<String,Object>();

        //放資料put()
        key="Tom";
        value=new Student("Tom",89,88,852);
        map.put(key,value);

        key="100";
        value="中正區";
        map.put(key,value);

        key="list";
        value=new ArrayList();
        map.put(key,value);





        key="map2";
        value=new HashMap<Object,Object>();
        map.put(key,value);






        //取資料get()
        // 可能需要資料轉型,當得到的資料與變數類型不符時)
        // 例如HashMap 的 value宣告為Object(抽象類型),可能是任何東西

        Student st;
        st=(Student) map.get("Tom");
        System.out.println(st);

        String area;
        area=(String) map.get("100");
        System.out.println(area);

        ArrayList<Object> list ;
        list=(ArrayList<Object>) map.get("list");
        System.out.println(list);

        HashMap<Object,Object> map2;
        map2=(HashMap<Object, Object>) map.get("map2");
        System.out.println(map2);














    }
}

