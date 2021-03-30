package homework51;

public class Mouse {
    private int mouseSpeed;

    public void setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed < 0) {
            throw new IllegalArgumentException("Скорость мыши не может быть отрицательной");
        }
        this.mouseSpeed = mouseSpeed;
    }

    public int getMouseSpeed() {
        return mouseSpeed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseSpeed=" + mouseSpeed +
                '}';
    }
}
