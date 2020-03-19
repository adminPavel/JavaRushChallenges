package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:JANUARY 1 2000 = trueJANUARY 2 2020 = false
 */


public class Solution {
    public static void main(String[] args) {


        System.out.println(isDateOdd("MAY 2 2015"));
    }

    public static boolean isDateOdd(String date) {
        Date dt1 = new Date(date);
        Date dt2 = new Date(date);
        dt1.setMonth(0);
        dt1.setDate(1);

//        System.out.println(dt1.getTime());
//        System.out.println(dt2.getTime());
        long a = (dt2.getTime()-dt1.getTime())/(3600*24*1000)+1;
        if (a % 2 != 0)
            return true;
        //System.out.println(dt2.getTime()-dt1.getTime());
        //System.out.println (a);
        return false;
    }
}
