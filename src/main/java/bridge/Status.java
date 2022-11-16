package bridge;

public enum Status {
    BRIDGE(0);
    private int size;

    Status(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}