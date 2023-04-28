package 骰子遊戲;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 計分 {
    int point;
    private Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {



    ArrayList  list = new ArrayList<Integer>();



        double t1 = Math.random();
        double t2 = Math.random();
        double t3 = Math.random();
        double t4 = Math.random();
        double t5 = Math.random();
        double t6 = Math.random();

        int d1 = (int) (t1 * 6) + 1;
        int d2 = (int) (t2 * 6) + 1;
        int d3 = (int) (t3 * 6) + 1;
        int d4 = (int) (t4 * 6) + 1;
        int d5 = (int) (t5 * 6) + 1;
        int d6 = (int) (t6 * 6) + 1;


        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);

        System.out.println(list);


        System.out.println("please select your choice: ");






//        if (null != list1)
//            switch (list1) {
//                case "{1,1,1}":
//                case "{1,2,3,4,5}":
//                case "{2,3,4,5,6}":case "{5,5,5,5}":
//                    point = 1000;
//                    break;
//                case "{2,2,2}":
//                    point = 200;
//                    break;
//                case "{3,3,3}":
//                    point = 300;
//                    break;
//                case "{4,4,4}": case "{2,2,2,2}":
//                    point = 400;
//                    break;
//                case "{5,5,5}":
//                    point = 500;
//                    break;
//                case "{6,6,6}":case "{3,3,3,3}":
//                    point = 600;
//                    break;
//                case "{1,1,1,1}":case "{5,5,5,5,5}":
//                    point = 2000;
//                    break;
//
//
//
//
//                case "{4,4,4,4}":case "{2,2,2,2,2}":
//                    point = 800;
//                    break;
//
//
//                case "{6,6,6,6}":case "{3,3,3,3,3}":
//                    point = 1200;
//                    break;
//                case "{1,1,1,1,1}": case "{5,5,5,5,5,5}":
//                    point = 4000;
//                    break;
//
//
//
//
//                case "{4,4,4,4,4}":case "{2,2,2,2,2,2}":
//                    point = 1600;
//                    break;
//
//
//                case "{6,6,6,6,6}": case "{3,3,3,3,3,3}":
//                    point = 2400;
//                    break;
//                case "{1,1,1,1,1,1}":
//                    point = 8000;
//                    break;
//
//
//
//                    point =2400;
//                    break;
//                case "{4,4,4,4,4,4}":
//                    point = 3200;
//                    break;
//
//                    point = 4000;
//                    break;
//                case "{6,6,6,6,6,6}":
//                    point = 4800;
//                    break;
//
//                case "{1}":
//                    point = 100;
//                    break;
//
//                case "{5}":
//                    point = 50;
//                    break;
//
//                default:
//                    break;
//            }
    }
}
