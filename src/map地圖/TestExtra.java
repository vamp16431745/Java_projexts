package map地圖;

import 動態陣列Arraylist.Student;
import 序列化.AppData;

import java.util.ArrayList;

public class TestExtra {
    public static void main(String[] args) {
        ArrayList<Student> list;
        list=new ArrayList();
        list.add(new Student("Kevin",60,85,899));
        list.add(new Student("Occu",89,46,485));

        ExtraData data;
        data = new ExtraData();

        //設定資料
        data.設定int資料("成績",100);
        data.設定字串資料("名字","Tom");
        data.設定map資料("陣列",list);


        //取資料
        int 成績=data.取得int資料("成績");
        CharSequence 名字=data.取得字串資料("名字");
        ArrayList<Student> 陣列 = (ArrayList<Student>)data.取得map資料("陣列");

        System.out.println(成績);
        System.out.println(名字);
        for(Student fghj :陣列)
        {
            System.out.println(fghj.toString());

        }



    }
}
