package com.up.skill.helpers;

/**
 * Created by JPMPC-B213 on 1/21/2017.
 */
public class Helpers {
    public static String forTest(String name) {
        return name + "123";
    }




    public  String testThis(String name) {
        return name + "12";
    }




    /*Fibonacci Series*/

    public static int[] fibonacciSequence(int fibonacci,int limitNum) {

        int limit = limitNum;
        int[] series = new int[limit];
        series[0]= fibonacci;//0 1
        boolean isFibonacci = false;
        if ( fibonacci != 0 ) { series[1]= fibonacci; }
        else { series[1]= 1; }
//
       System.out.print("[" + series[0] + "] ");
       System.out.print("[" + series[1] + "] ");

        for (int i = 2; i < limit; i++) {//3 //4 --- 20
            series[i] = series[i - 1] + series[i - 2];
            System.out.print("[" + series[i] + "] ");
        }
        System.out.println(series);
        return series;


        /*for (int x = 0; x < limit; x++) {
           System.out.print(series[x] + "");*/
        }

    public static int add(int first, int second) {
        return first + second ;
    }
}
