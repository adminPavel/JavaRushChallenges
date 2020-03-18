package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.

Требования:
Программа должна выводить текст на экран.
Класс Solution должен содержать только три метода.
Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
Метод printPeopleMap() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
Метод main() должен вызывать метод createPeopleMap().
Метод main() должен вызывать метод printPeopleMap().
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap <String, String> hm = new HashMap <String, String>();
        hm.put("Иванов", "Дурак");
        hm.put("Иванидзе", "Иван");
        hm.put("Иванов", "Исак");
        hm.put("Петров", "Петр");
        hm.put("Сидоров", "Сидр");
        hm.put("Прутков", "Кузьма");
        hm.put("Толстой", "Алексей");
        hm.put("Тонкий", "Лев");
        hm.put("Пушкин", "Михаил");
        hm.put("Кукушкин", "Петр");

        return hm;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
