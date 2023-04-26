/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 物件類別_封裝_建構子;

/**
 *
 * @author user
 */
public class date_constructer 
{
    private int year;
    private int month;
    private int day;

    
    
    //建構子
    public date_constructer(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getter
    public int getYear() {
        return year;
    }

    //setter
    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "date_constructer{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }
    
    
   
    
    
}
    

