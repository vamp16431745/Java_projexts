/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.script.ScriptEngine;


public class dog {
    String name;
    String color;
    int age;


    public static void main(String[] args) {
        dog mydog=new dog();
        mydog.name="小白";
        mydog.color="白色";
        mydog.age=15;
        
        System.out.printf("我有一隻叫%s,顏色為%s,年齡為%d的狗",mydog.name,mydog.color,mydog.age);
    }
    
}
