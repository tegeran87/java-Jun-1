package ru.geekbrains.seminar_1.task_1;

import java.util.ArrayList;
import java.util.List;

/*
 */
public class NumbersSelector {
    public static void main(String[] args) {
        // Создадим массив целых чисел
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println("\nИсходный список чисел: " + numbers);

        // Выделим из массива четные числа и запишем их в новый массив
        List<Integer> evenNumbers  = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("\nСписок четных чисел:   " + evenNumbers);

        // Посчитаем сумму всех четных чисел массива и разделим ее на количество слагаемых
        int average = evenNumbers.stream().mapToInt(i -> i).sum() / evenNumbers.size();
        System.out.println("\nСреднее значение четных чисел: " + average);


        // Выделим из массива четные числа
//        List<Integer> evenNumbers = new ArrayList<>();
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                evenNumbers.add(number);
//            }
//        }
//        System.out.println("\nСписок четных чисел:   " + evenNumbers);


        // Посчитаем сумму всех четных чисел массива и разделим ее на количество слагаемых
//        int sum = 0;
//        for (Integer number : evenNumbers) {
//            sum = number + sum;
//        }
//        System.out.println("\nСреднее значение четных чисел: " + sum / evenNumbers.size());
    }
}
