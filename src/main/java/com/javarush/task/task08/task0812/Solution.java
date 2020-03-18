package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Cамая длинная последовательность
Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
Программа должна выводить число на экран.
Программа должна считывать значения с клавиатуры.
В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
Программа должна добавлять в коллекцию 10 чисел, согласно условию.
Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);

        ArrayList<Integer> lst = new ArrayList<Integer>();


        for (int i=0; i<10; i++) {
            lst.add(sc.nextInt());
        }

        int count = 1;
        int max_count = 1;

        for (int i = 1; i < 10; i++) {
            //if (lst.get(i-1).compareTo(lst.get(i)) != 0)
            if (lst.get(i-1)!=lst.get(i))
                count = 1;
            else {
                count++;
                if (count > max_count)
                    max_count = count;
            }
        }

        System.out.println(max_count);
    }
}
