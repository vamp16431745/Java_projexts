/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.practice;

/**
 *
 * @author user
 */
public class 國王的麥粒 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {int sum =0;
    double wheat =1;
    int i;
    for(i=0;i<2;i++)
    {
        if(i==0)
            wheat=1;
        else
            wheat=Math.pow(2, i);
        sum+=wheat;
    }
        System.out.println("麥粒總共=" +sum);
   
    }
    
}
