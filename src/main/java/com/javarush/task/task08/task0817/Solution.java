package com.javarush.task.task08.task0817;

/*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hm =new HashMap<String, String>();

        hm.put("Иванов", "Иван");
        hm.put("Иванидзе", "Иван");
        hm.put("Иваник", "Петр");
        hm.put("Петров", "Петр");
        hm.put("Сидоров", "Сидр");
        hm.put("Прутков", "Кузьма");
        hm.put("Толстой", "Алексей");
        hm.put("Тонкий", "Лев");
        hm.put("Пушкин", "Михаил");
        hm.put("Кукушкин", "Сергей");

        return hm;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hm =  createMap();
        removeTheFirstNameDuplicates (hm);

        for (Map.Entry <String,String> pair : hm.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());

    }
}
