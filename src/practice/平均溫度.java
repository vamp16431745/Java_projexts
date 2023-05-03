/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author user
 */
public class 平均溫度 {

    public static void main(String[] args)
    {
        double average;
        double total = 0;
        double[] degree;
        degree = new double[7];

        degree[0] = 25;
        degree[1] = 16;
        degree[2] = 27;
        degree[3] = 29;
        degree[4] = 23;
        degree[5] = 22;
        degree[6] = 28;

        for (int i = 0; 1 < 7; i++) {
            total += degree[i];
            average = total/7;
            System.out.printf("一週平均溫度:%5.2f", average);
        }

    }

}
