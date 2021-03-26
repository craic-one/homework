package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        // Задание 3
        System.out.println("Введите фразу");
        Scanner palindrome = new Scanner(System.in);
        String pal = palindrome.nextLine(); //ввели фразу

        StringBuilder pal1 = new StringBuilder(pal); //
        pal1.reverse().toString(); //развернули фразу

        System.out.println(pal);
        System.out.println(pal1);


        //удалили все пробелы
        //удалили все пробелы еще раз



        //if ((pal.equalsIgnoreCase(reversPal))) {
        //    System.out.println("Фраза палиндром");
        //} else {
        //    System.out.println("Фраза НЕ палиндром");
        //}



        // Задание 1
        System.out.println("Введите количество слов");
        Scanner in = new Scanner(System.in); // подключили сканер для ввода
        int size = in.nextInt(); // сохраняем размер массива в переменной size
        String[] words = new String[size]; // создаем массив words с размером size от пользователя
        System.out.println("Введите " + size + " слов(а)");
        for (int i = 0; i < size; i++) {
            if (words[i] == "exit") break; //
            words[i] = in.next(); //заполняем массив словами с клавиатуры)
            //как проверить на повторы не додумался
        }
        System.out.println("Массив слов:");
        System.out.println(Arrays.toString(words));


    }
}
