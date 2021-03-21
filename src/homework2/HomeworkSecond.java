package homework2;

import java.util.Scanner;

public class HomeworkSecond {
    public static void main(String[] args) {

        //Задание 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество правильных ответов:");
        int count = in.nextInt();

        if (count >= 90) {
            System.out.println("Ваша оценка: Отлично");
        } else if (count >= 60) {
            System.out.println("Ваша оценка: Хорошо");
        } else if (count >= 40) {
            System.out.println("Ваша оценка: Удовлетворительно");
        } else {
            System.out.println("Попробуйте в следующий раз, не огорчайтесь");
        }

        //Задание 2
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите два числа через Enter:");
        Double a = in2.nextDouble();
        double b = in2.nextDouble();
        System.out.println("Введите код операции:");
        int c = in2.nextInt();

        switch (c) {
            case 3:
                System.out.println(a + b);
                break;
            case 5:
                System.out.println(a - b);
                break;
            case 7:
                System.out.println(a * b);
                break;
            case 9:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Введен недопустимый код операции");
        }

        //Задание 3
        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите кол-во грязных тарелок:");
        int t = in3.nextInt();
        System.out.println("Введите кол-во моющего средства:");
        double m = in2.nextInt();

        while (true) {
            System.out.println("Моющего средства осталось (ед.) " + (m = m - 0.5));
            System.out.println("Грязных тарелок еще " + (t = t - 1));
            if ((m == 0) || (t == 0)) break;
        }
        System.out.println("Осталось грязных тарелок: " + t);
        System.out.println("Осталось моющего средства: " + m);

        //Задание 4
        int e = 7;

        Scanner in4 = new Scanner(System.in);

        while (true) {
            System.out.println("Угадайте цифру");
            int userNum = in.nextInt();
            if (userNum < e) {
                System.out.println("Загаданное число больше");
            }
            ;
            if (userNum > e) {
                System.out.println("Загаданное число меньше");
            }
            ;
            if (userNum == 0) break;
            if (userNum == e) {
                System.out.println("Вы угадали!");
            }
            ;
        }

        //Задание 5
        int f = 1;
        int s = 500;

        int randNum = f + (int) (Math.random() * s);
        System.out.println("Случайное число: " + randNum);

        if (randNum >= 200) {
            System.out.println("Число " + randNum + " не содержится в интервале (25;200)");
        } else if (randNum <= 25) {
            System.out.println("Число " + randNum + " не содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + randNum + " содержится в интервале (25;200)");
        }

        //Задание 6


    }
}
