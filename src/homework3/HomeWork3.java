package homework3;

import java.util.Arrays;
import java.lang.Math;


public class HomeWork3 {
    public static void main(String[] args) {

        //Задание 1
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        double tmp = 0;

        double[] ints = new double[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Math.random() * 497 + 3; //заполнение массива от 3 до 500 случайными элементами
            if (ints[i] < max) max = ints[i]; //минимальное значение массива
            if (ints[i] > min) min = ints[i]; //максимальное значение массива
        }

        System.out.println(Arrays.toString(ints)); //вывод первоначального массива
        System.out.println("Минимальное значение в массиве " + max); //вывод мин элемента
        System.out.println("Максимальное значение в массиве " + min); //вывод макс элемента



        // Задание 2

        int[] ints2 = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 == 0) count1++; //узнали размер массива НЕчетных чисел
            if (ints2[i] % 2 != 0) count2++; //узнали размер массива четных чисел
        }

        int[] even = new int[count2]; //узнали размер массива четных чисел и создали его
        int[] odd = new int[count1]; //узнали размер массива НЕчетных чисел и создали его

        int index = 0;
        for (int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 == 0) {
                odd[index] = ints2[i];
                index++;
            }
        }
        int index2 = 0;
        for (int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 != 0) {
                even[index2] = ints2[i];
                index2++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);
        System.out.println("Массив четных чисел " + Arrays.toString(odd));
        System.out.println("Массив НЕчетных чисел " + Arrays.toString(even));


        //Задание 3
        int[] ints3 = {-321, 894, -45, 782, -29, 12, -88};
        int count3 = 0;

        for (int i = 0; i < ints3.length; i++) {
            if (ints3[i] < 0) count3++; //узнали размер массива отрицательных чисел
        }

        int[] minusNum = new int[count3]; //создали массив по размеру
        int index3 = 0;
        for (int i = 0; i < ints3.length; i++) {
            if (ints3[i] < 0) {
                minusNum[index3] = ints3[i];
                index3++;
            }
        }
        System.out.println("Массив отрицательных чисел " + Arrays.toString(minusNum));

        // Задание 4
        // int[] ints4 = new int [];

        //Задание 5
        double[] ints5 = new double[11];
        for (int i = 0; i < ints5.length; i++) {
            ints5[i] = (double) ((Math.random() * (1 + 1)) - 1);
        }
        // double randomDouble = (double) ((Math.random() * (1 + 1)) -1); //случайное число от (-1 до 1)
        System.out.println("Массив [11] случайных чисел: (-1;1):");
        System.out.println(Arrays.toString(ints5));
//надо узнать все char ints5

        //узнаем размер массива ints5
        int count5 = 0;
        for (int i = 0; i < ints5.length; i++) {
            //if count5++; //узнали размер массива ints5
        }
        //создадим новый массив из цифр предыдущего
        //int[] ints6 = new int[count5];
        //System.out.println(Arrays.toString(ints6));


    }
}
