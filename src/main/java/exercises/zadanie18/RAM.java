package exercises.zadanie18;

public enum RAM {
    DDR(8),
    DDR2(16),
    SDRAM(8);
    public int size;

    RAM(int size) {
        this.size = size;
    }
}
