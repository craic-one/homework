package homework51;

import java.util.Arrays;
import java.util.Objects;

public class Cat {
    private String catName;
    private String catColor;
    private int catSpeed;
    private int catWeight;
    private Mouse[] mice = new Mouse[100];

    public Cat(String catName, int catSpeed, int catWeight) {
        this.catName = catName;
        this.catSpeed = catSpeed;
        this.catWeight = catWeight;

    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public int getCatWeight() {
        return catWeight;
    }

    public Mouse[] getMice() {
        return mice;
    }

    public void addMouse(Mouse mouse) {
        if (catSpeed <= mouse.getMouseSpeed()) return;
        for (int i = 0; i < mice.length; i++) {
            if (mice[i] == null) {
                mice[i] = mouse;
                return;
            }
        }
    }

    public void attack(Cat cat) {
        if (catWeight <= cat.getCatWeight()) return;
        for (int i = 0; i < cat.getMice().length; i++) {
            if (cat.getMice()[i] != null) {
                if (catSpeed > cat.getMice()[i].getMouseSpeed()) {
                    addMouse(cat.getMice()[i]);
                    cat.getMice()[i] = null;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catColor='" + catColor + '\'' +
                ", catSpeed=" + catSpeed +
                ", catWeight=" + catWeight +
                ", mice=" + Arrays.toString(mice) +
                '}';
    }
}
