package com.javarush.task.task08.task0816;

/*
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date(1983, 1, 2));
        map.put("Gibson", new Date(1984, 2,23));
        map.put("Medvedev", new Date(1985, 3,2));
        map.put("Chapaev", new Date(1986, 4,10));
        map.put("Noris", new Date(1987, 5,11));
        map.put("Chan", new Date(1988, 6,12));
        map.put("Uilis", new Date(1989, 2,13));
        map.put("Shvarsneger", new Date(1984, 6,15));
        map.put("Lungren", new Date(1985, 7,17));
        map.put("Rodriges", new Date(1986, 9,28));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator itr = map.entrySet().iterator();

        Date dt;
        while (itr.hasNext()) {
            Map.Entry pair = (Map.Entry) itr.next();
            dt = (Date) pair.getValue();
            if (dt.getMonth()>=5 && dt.getMonth()<=7)
                itr.remove();
        }

        String key;
        for(Map.Entry entry: map.entrySet()) {
            key = entry.getKey().toString();
            dt = (Date) entry.getValue();
            System.out.println(key+"  "+dt);
        }
        return;
    }

    public static void main(String[] args) {
        HashMap<String, Date> hm = createMap();
        removeAllSummerPeople (hm);
    }
}
