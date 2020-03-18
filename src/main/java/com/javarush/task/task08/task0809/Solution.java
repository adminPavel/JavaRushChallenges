package com.javarush.task.task08.task0809;

/*
        Время для 10 тысяч вставок
        Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.

Требования:
Программа должна выводить числа на экран.
Метод main должен вызывать метод getInsertTimeInMs только два раза.
Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
        */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код
        Date dt_after = new Date();
        insert10000(list);

        //напишите тут ваш код
        Date dt_before = new Date();
        return  dt_before.getTime() - dt_after.getTime();

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
