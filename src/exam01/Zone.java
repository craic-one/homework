package exam01;

public enum Zone {
    SWIM(20), GYM(20), GROUP(20);

    private int count;

    Zone(int count) {
        this.count = count;
    }
}
