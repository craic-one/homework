package homework51;

public class Mouse {
    private int mouseSpeed;

    public void setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed < 0) {
            throw new IllegalArgumentException("Скорость мыши не может быть отрицательной");
        }
        this.mouseSpeed = mouseSpeed;
    }
}
