package com.javarush.task.task07.task0715;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list =new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1,"именно");
        list.add(3,"именно");
        list.add("именно");

        for (String item : list) {
            System.out.println(item);
        }


    }
}
