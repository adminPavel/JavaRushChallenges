package com.javarush.task.task08.task0813;

/*
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
Не изменяй заголовок метода createSet().
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createSet() должен создавать и возвращать множество (реализация HashSet).
Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

import java.util.HashSet;

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet <String> hs = new HashSet<String>();
        hs.add("Лес");
        hs.add("Ложка");
        hs.add("Лань");
        hs.add("Лен");
        hs.add("Лук");
        hs.add("Лупа");
        hs.add("Лемур");
        hs.add("Лут");
        hs.add("Лоб");
        hs.add("Люк");
        hs.add("Лещь");
        hs.add("Лак");
        hs.add("Лик");
        hs.add("Лицо");
        hs.add("Липа");
        hs.add("Лось");
        hs.add("Лампа");
        hs.add("Листва");
        hs.add("Лакомка");
        hs.add("Лесовоз");

        return hs;
    }

    public static void main(String[] args) {

    }
}
