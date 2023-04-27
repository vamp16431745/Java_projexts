/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author user
 */
class Student
{
    private CharSequence name;
    private int eng;
    private int math;

    //constructer
    public Student(CharSequence name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    //getter
    public CharSequence getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    //toString()
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", eng=" + eng + ", math=" + math + '}';
    }
    
    
    
    
}


public class Student_Test {


    public static void main(String[] args)
    {
        String s;
        StringBuilder sb;
        
       s="Amy";
       sb=new StringBuilder("Jack");
       
       Student st1;
       st1=new Student(s, 100, 95);
       
       Student st2;
       st2= new Student(sb, 90,88);
       
        System.out.println(st1.toString());
        System.out.println(st2.toString());
       
       
        

    }
    
}
