package com.javarush.task.task08.task0815;

/*
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

import java.util.HashMap;

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hm = new HashMap <String, String>();

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

        return  hm;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count =0;
        for (String s : map.values())
            if (s.equals(name))
                count +=1;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count =0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count +=1;
        return count;
    }

    public static void main(String[] args) {
        HashMap <String, String> hm = createMap ();
        System.out.println(getCountTheSameFirstName (hm, "Петр" ));
        System.out.println(getCountTheSameLastName (hm, "Толстой" ));

    }
}


//for (Map.Entry entry : map.entrySet())
//if (entry.getValue().equals(name))
