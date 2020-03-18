package com.javarush.task.task08.task0822;

/*
Минимальное из N чисел

1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
Программа должна выводить текст на экран.
Программа должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
Метод getMinimum() должен вернуть минимальное число среди элементов списка.
Метод main() должен вызывать метод getIntegerList().
Метод main() должен вызывать метод getMinimum().
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = array.get(0).intValue();
        for (int i=1;i<array.size();i++)
            if (array.get(i).intValue() < min)
                min = array.get(i).intValue();
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i=0;i<n;i++)
            lst.add(Integer.parseInt(sc.nextLine()));

        return lst;
    }
}
