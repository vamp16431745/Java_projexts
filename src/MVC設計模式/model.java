/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC設計模式;

/**
 *
 * @author user
 */
public class model 
{
    private String name;
    private int eng;
    private int math;

    //constructer
    public model(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
    
    
    
    
    
    
    
}
