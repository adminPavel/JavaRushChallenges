package com.javarush.task.task08.task0828;

/*
Номер месяца

Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
Программа должна считывать одно значение с клавиатуры.
Программа должна выводить текст на экран.
Программа должна использовать коллекции.
Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList<String>(Arrays.asList(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"));

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int index = months.indexOf(s);
        if (index < 0)
            return;

        System.out.printf("%s is %d month\n", months.get(index), index + 1);
    }
}