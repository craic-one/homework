package homework1;

public class HomeWork1 {

    public static void main(String[] args) {
// задание 2
        long start = 56;
        long end = 23;
        long between = start < end ? end - start : -1;
        System.out.println(between);

// задание 3
        int a = 57;
        System.out.println(a % 10);
        System.out.println(a / 10);
        int b = a % 10 + a / 10;
        System.out.println(b);

// задание 4
        a = 679;
        b = a / 100; // первое число
        int c = a % 100; // двузначный остаток
        int d = c % 10 + c / 10 + b;
        System.out.println(d);
    }
}

