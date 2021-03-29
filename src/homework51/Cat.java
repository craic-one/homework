package homework51;

public class Cat {
    private String catName;
    private String catColor;
    private int catSpeed;
    private int catWeight;
    private int catMouseCounter;

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public void setCatSpeed(int catSpeed) {
        if (catSpeed < 0) {
            throw new IllegalArgumentException("Скорость кота не может быть отрицательной");
        }
        this.catSpeed = catSpeed;
    }

    public void setCatWeight(int catWeight) {
        if (catWeight < 0) {
            throw new IllegalArgumentException("Вес кота не может быть отрицательным");
        }
        this.catWeight = catWeight;
    }

    public void setCatMouseCounter(int catMouseCounter) {
        if (catMouseCounter < 0) {
            throw new IllegalArgumentException("Отрицательное значение кол-ва мыщей");
        }
        this.catMouseCounter = catMouseCounter;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catColor='" + catColor + '\'' +
                ", catSpeed=" + catSpeed +
                ", catWeight=" + catWeight +
                ", catMouseCounter=" + catMouseCounter +
                '}';
    }
}
