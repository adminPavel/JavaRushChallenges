package com.javarush.task.task08.task0814;

/*
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < 20; i++)
            hs.add(i);

        return hs;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        Integer a;
        while (iterator.hasNext()) {
            a = iterator.next();
            if (a.compareTo(10) > 0) iterator.remove();
        }
        return set;
    }


    public static void main(String[] args) {
//
//        HashSet <Integer> set =  createSet ();
//        HashSet <Integer> set1 = removeAllNumbersMoreThan10 (set);
//        for (Integer a: set1)
//            System.out.println(a);
//
    }
}