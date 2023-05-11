package HashMap;

import 動態陣列Arraylist.Student;

import java.util.ArrayList;

public class TestExtra
{
    public static void main(String[] args)
    {
        ArrayList<動態陣列Arraylist.Student> list;
        list=new ArrayList();
        list.add(new Student("Jack",84,65,468));
        list.add(new Student("Amy",46,96,881));

        ExtraData data;
        data =new ExtraData();

        //寄資料
        data.putExtra("成績:",100);
        data.putExtra("名字","Tom");
        data.putExtra("陣列",list);

        //取資料
        int 成績=data.getIntExtra("成績");
        CharSequence 名字 =data.getCharSequenceExtra("名字");
        ArrayList<Student> 陣列=(ArrayList<Student>) data.getObjectExtra("陣列");

        System.out.println(成績);
        System.out.println(名字);
        for (Student x:陣列)
        {
            System.out.println(x.toString());
        }





    }
}
