package exam01;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        Client petr = new Client("Петр Андреев",1986);
        LocalDate startDate = LocalDate.of(2021, 02, 20);
        LocalDate endDate = LocalDate.of(2022, 02, 20);
        Membership m1 = new Membership(startDate,endDate,petr,Type.FULL);
        Fitness fitness = new Fitness();
        fitness.entrance(Zone.SWIM,m1);
        fitness.entrance(Zone.SWIM,m1);
        System.out.println();
        System.out.println("Кто где чем занимается:");
        fitness.print();
        fitness.close();
        System.out.println();
        System.out.println("Фитнес-клуб закрывается, всех выгоняем:");
        fitness.print();
    }

}
