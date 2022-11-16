package bridge;

public enum Bridge {
    BRIDGE(0);

    private int size;

    Bridge(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}