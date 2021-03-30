package homework51;

public class Zooapp {
    public static void main(String[] args) {
        Cat busik = new Cat("Бусик", 8, 6);
        busik.setCatColor("серый");

        Cat petr = new Cat("Петр",9,3);

        Mouse jerry = new Mouse();
        jerry.setMouseSpeed(4);

        Mouse mouse2 = new Mouse();
        mouse2.setMouseSpeed(2);

        busik.addMouse(jerry);
        petr.addMouse(mouse2);

        busik.attack(petr);

        System.out.println(busik);
        System.out.println(petr);


    }
}
